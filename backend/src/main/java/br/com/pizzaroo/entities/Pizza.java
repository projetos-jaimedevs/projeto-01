package br.com.pizzaroo.entities;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
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
@Table(name = "pizzas")
public class Pizza extends TenantEntity {

	private Integer quantidadeSaboresPizza;
	private BigDecimal valorPizza;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "pedido_id", nullable = false)
	private Pedido pedido;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "tamanho_id", nullable = false)
	private Tamanho tamanho;

	@OneToMany(mappedBy = "pizza", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<ItemSabor> sabores = new ArrayList<>();

}
