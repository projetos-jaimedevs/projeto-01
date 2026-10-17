package br.com.pizzaroo.entities;

import java.math.BigDecimal;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
@Table(name = "itens_sabor")
public class ItemSabor  extends TenantEntity {
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "pizza_id", nullable = false)
	private Pizza pizza;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "sabor_id", nullable = false)
	private Sabor sabor;
	
	private BigDecimal valorItem;
	
}
