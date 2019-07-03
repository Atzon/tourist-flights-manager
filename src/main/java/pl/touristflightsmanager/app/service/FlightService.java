package pl.touristflightsmanager.app.service;

import pl.touristflightsmanager.app.model.Flight;
import pl.touristflightsmanager.app.model.Tourist;

import java.util.List;

public interface FlightService {
    Flight create(Flight flight);
    Flight getById(Long id);
    Flight updateById(Long id, Flight flight);
    void deleteById(Long id);
    List<Flight> getAll();
}
