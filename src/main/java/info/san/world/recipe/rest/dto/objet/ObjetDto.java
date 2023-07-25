package info.san.world.recipe.rest.dto.objet;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ObjetDto {
    
    @NotBlank(groups = Update.class)
    private String id;
    
    @NotBlank(groups = { Create.class, Update.class })
    private String nom;
    
    private String description;
    
    private boolean conteneur;

    public interface Update { }
    
    public interface Create { }
    
}
