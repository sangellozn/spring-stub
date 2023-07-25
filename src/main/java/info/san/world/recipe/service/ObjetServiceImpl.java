package info.san.world.recipe.service;

import java.util.Collection;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import info.san.world.recipe.mapper.ObjetMapper;
import info.san.world.recipe.model.Objet;
import info.san.world.recipe.repository.ObjetRepository;
import info.san.world.recipe.rest.dto.objet.ObjetDto;

@Service
public class ObjetServiceImpl implements IObjetService {
    
    private final ObjetRepository objetRepository;
    
    private final ObjetMapper objetMapper;
    
    public ObjetServiceImpl(ObjetRepository objetRepository, ObjetMapper objetMapper) {
        this.objetRepository = objetRepository;
        this.objetMapper = objetMapper;
    }

    @Transactional
    @Override
    public ObjetDto create(ObjetDto item) {
        Objet objet = objetRepository.save(objetMapper.map(item));

        return getById(objet.getId());
    }
    
    @Transactional
    @Override
    public void update(ObjetDto item) {
        Objet objet = objetRepository.getReferenceById(item.getId());
        
        objetMapper.update(objet, item);
    }

    @Transactional
    @Override
    public void deleteById(String id) {
        objetRepository.deleteById(id);
    }

    @Transactional(readOnly = true)
    @Override
    public ObjetDto getById(String id) {
        return objetMapper.map(objetRepository.getReferenceById(id));
    }

    @Transactional(readOnly = true)
    @Override
    public Collection<ObjetDto> findAll() {
        return objetRepository.findAll().stream()
                .map(objetMapper::map)
                .toList();
    }

}
