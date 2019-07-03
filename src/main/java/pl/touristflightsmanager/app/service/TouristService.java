package pl.touristflightsmanager.app.service;

import pl.touristflightsmanager.app.model.Tourist;

import java.util.List;

public interface TouristService {
    Tourist create(Tourist tourist);
    Tourist getById(Long id);
    Tourist updateById(Long id, Tourist tourist);
    void deleteById(Long id);
    List<Tourist> getAll();
}
