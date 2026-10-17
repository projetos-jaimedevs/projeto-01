package br.com.pizzaroo.entities;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

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
@Table(name = "bebidas")
public class Bebida extends TenantEntity {
		
	private String descricao;
	private Integer quantidade;
	private Integer quantidadeMinima;
	private BigDecimal valor;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "tipo_bebida_id")
	private TipoBebida tipo;
	
	@OneToMany(mappedBy = "bebida")
	private List<ItemBebida> itens = new ArrayList<>();
}
