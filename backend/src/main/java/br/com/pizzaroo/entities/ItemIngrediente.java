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
@Table(name = "itens_ingrediente")
public class ItemIngrediente extends TenantEntity {
	
    private BigDecimal quantidadeItemIngrediente;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "sabor_id", nullable = false)
    private Sabor sabor;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ingrediente_id", nullable = false)
    private Ingrediente ingrediente;
}
