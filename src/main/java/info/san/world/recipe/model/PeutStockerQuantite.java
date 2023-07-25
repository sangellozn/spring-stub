package info.san.world.recipe.model;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@EqualsAndHashCode
public class PeutStockerQuantite {
    
    @Id
    @ManyToOne
    private Objet conteneur;
    
    @Id
    @ManyToOne
    private Objet contenu;
    
    @Column(name = "valeur", precision = 15, scale = 2)
    private BigDecimal valeur;

}
