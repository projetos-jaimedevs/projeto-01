package br.com.pizzaroo.entities;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
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
@Table(name = "sabores")
public class Sabor extends TenantEntity {
	
	private String nome;
	private BigDecimal valor;
	
	@OneToMany(mappedBy = "sabor")
	private List<ItemSabor> itens = new ArrayList<>();

}
