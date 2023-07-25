package info.san.world.recipe.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import info.san.world.recipe.model.Objet;

@Repository
public interface ObjetRepository extends JpaRepository<Objet, String> {

}
