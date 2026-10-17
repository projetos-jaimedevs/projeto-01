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
@Table(name = "cargos")
public class Cargo extends TenantEntity {

	@Column(nullable = false)
	private String descricao;
	
	@OneToMany(mappedBy = "cargo")
	private List<Funcionario> funcionarios = new ArrayList<>();
	
}
