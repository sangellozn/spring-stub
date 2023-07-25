package info.san.world.recipe.model;

import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Objet {
    
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id", nullable = false, length = 36)
    private String id;
    
    @Column(name = "nom", nullable = false, length = 100)
    private String nom;
    
    @Column(name = "description", length = 255)
    private String description;
    
    @Column(name = "conteneur", nullable = false)
    private boolean conteneur;
    
    @OneToMany(mappedBy = "conteneur")
    private Set<PeutStockerQuantite> peutStocker;
    
}
