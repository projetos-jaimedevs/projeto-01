package br.com.pizzaroo.entities;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "ingredientes")
public class Ingrediente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(nullable = false)
	private String descricao;
	private String unidade;
	private BigDecimal quantidade;
	private BigDecimal quantidadeMinima;

	@OneToMany(mappedBy = "ingrediente")
	private List<ItemIngrediente> itens = new ArrayList<>();
	
	@OneToMany(mappedBy = "ingrediente")
    private List<ItemCompraIngrediente> compras = new ArrayList<>();

}
