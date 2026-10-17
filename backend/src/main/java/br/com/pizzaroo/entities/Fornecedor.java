package br.com.pizzaroo.entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
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
@Table(name = "fornecedores")
public class Fornecedor extends TenantEntity {

	@Column(nullable = false)
	private String nome;
	
	private String telefone;
	
	private String email;
	
	@OneToMany(mappedBy = "fornecedor")
	private List<Compra> compras = new ArrayList<>();
}
