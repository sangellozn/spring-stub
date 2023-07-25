package info.san.world.recipe.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

import info.san.world.recipe.model.Objet;
import info.san.world.recipe.rest.dto.objet.ObjetDto;

@Mapper(componentModel = "spring")
public interface ObjetMapper {

    @Mapping(target = "nom", source = "nom")
    @Mapping(target = "description", source = "description")
    @Mapping(target = "conteneur", source = "conteneur")
    @Mapping(target = "peutStocker", ignore = true)
    Objet map(ObjetDto objetDto);
    
    @Mapping(target = "nom", source = "nom")
    @Mapping(target = "description", source = "description")
    @Mapping(target = "conteneur", source = "conteneur")
    @Mapping(target = "peutStocker", ignore = true)
    void update(@MappingTarget Objet objet, ObjetDto objetDto);
    
    @Mapping(target = "id", source = "id")
    @Mapping(target = "nom", source = "nom")
    @Mapping(target = "description", source = "description")
    @Mapping(target = "conteneur", source = "conteneur")
    ObjetDto map(Objet objet);
    
}
