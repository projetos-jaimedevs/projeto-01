package br.com.pizzaroo.entities;

import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Embeddable
public class Endereco {
	
	private String logradouro;
	private String bairo;
	private String cidade;
	private String cep;
	private String estado;
	
}
