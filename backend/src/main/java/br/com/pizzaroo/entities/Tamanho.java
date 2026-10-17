package br.com.pizzaroo.entities;

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
@Table(name = "tamanhos")
public class Tamanho extends TenantEntity {
	
	private String descricao;
	
	private Integer numeroPedido;
	
	private Integer quantidadeSabores;
	
	@OneToMany(mappedBy = "tamanho")
	private List<Pizza> pizzas = new ArrayList<>();

}
