package info.san.world.recipe.rest.controller;

import java.util.Collection;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import info.san.world.recipe.rest.dto.objet.ObjetDto;
import info.san.world.recipe.rest.dto.objet.ObjetDto.Create;
import info.san.world.recipe.rest.dto.objet.ObjetDto.Update;
import info.san.world.recipe.service.IObjetService;

@RestController
@RequestMapping("api/objets")
public class ObjetController {
    
    private final IObjetService objetService;
    
    public ObjetController(IObjetService objetService) {
        this.objetService = objetService;
    }

    @GetMapping
    public Collection<ObjetDto> findAll() {
        return objetService.findAll();
    }
    
    @GetMapping("{id}")
    public ObjetDto getById(@PathVariable("id") String id) {
        return objetService.getById(id);
    }
    
    @PutMapping("{id}")
    public void update(@RequestBody @Validated(value = { Update.class }) ObjetDto objetDto) {
        objetService.update(objetDto);
    }
    
    @PostMapping
    public ObjetDto create(@RequestBody @Validated(value = { Create.class }) ObjetDto objetDto) {
        return objetService.create(objetDto);
    }
    
    @DeleteMapping("{id}")
    public void delete(@PathVariable("id") String id) {
        objetService.deleteById(id);
    }
    
}
