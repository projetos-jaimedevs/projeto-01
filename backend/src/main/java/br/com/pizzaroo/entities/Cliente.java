package br.com.pizzaroo.entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
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
@Table(name = "clientes")
public class Cliente extends TenantEntity {

	@Column(nullable = false, unique = true)
	private String login;
	
	@Column(nullable = false)
	private String senha;
	
	@Column(nullable = false)
	private String nome;
	
	private String telefone;
	
	@Column(unique = true)
	private String email;
	
	@Embedded
	private Endereco endereco;
	
	@OneToMany(mappedBy = "cliente")
	private List<Pedido> pedidos = new ArrayList<>();
	
	@OneToMany(mappedBy = "cliente", 
				cascade = CascadeType.ALL, 
				fetch = FetchType.LAZY, 
				orphanRemoval = true)
	private List<Opiniao> opinioes = new ArrayList<>();
}
