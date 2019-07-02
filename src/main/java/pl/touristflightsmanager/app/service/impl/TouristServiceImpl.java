package pl.touristflightsmanager.app.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
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
        return null;
    }

    @Override
    public Tourist getById(Long id){
        return null;
    }
    @Override
    public List<Tourist> getAll() {
        return null;
    }
}
