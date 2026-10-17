package br.com.pizzaroo.entities;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import br.com.pizzaroo.enums.SituacaoPedido;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "pedidos")
public class Pedido  extends TenantEntity {
	
	@Column(nullable = false, unique = true)
	private Long numeroPedido;	
	
	private LocalDateTime dataHoraPedido;
	
	@Enumerated(EnumType.STRING)
	private SituacaoPedido situacaoPedido;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "cliente_id", nullable = false)
	private Cliente cliente;
	
	@OneToMany(mappedBy = "pedido", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Pizza> pizzas = new ArrayList<>();
	
	@OneToMany(mappedBy = "pedido", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<ItemBebida> bebidas = new ArrayList<>();
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "funcionario_preparacao_id")
	private Funcionario funcionarioPreparacao;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "funcionario_entrega_id")
	private Funcionario funcionarioEntrega;
}














