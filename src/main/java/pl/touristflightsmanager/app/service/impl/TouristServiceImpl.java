package pl.touristflightsmanager.app.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.touristflightsmanager.app.model.Flight;
import pl.touristflightsmanager.app.model.Tourist;
import pl.touristflightsmanager.app.repository.TouristRepository;
import pl.touristflightsmanager.app.service.TouristService;

import java.util.List;

@Service
public class TouristServiceImpl implements TouristService {

    @Autowired
    private TouristRepository repository;

    @Override
    public Tourist create(Tourist tourist) {
        return repository.save(tourist);
    }

    @Override
    public Tourist getById(Long id){
        return repository.getOne(id);
    }

    @Override
    public Tourist updateById(Long id, Tourist tourist) {
        return repository.save(Tourist.builder().touristId(id).build());
    }

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }

    @Override
    public List<Tourist> getAll() {
        return repository.findAll();
    }
}
