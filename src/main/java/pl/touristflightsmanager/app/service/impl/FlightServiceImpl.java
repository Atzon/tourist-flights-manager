package pl.touristflightsmanager.app.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.touristflightsmanager.app.model.Flight;
import pl.touristflightsmanager.app.model.Tourist;
import pl.touristflightsmanager.app.repository.FlightRepository;
import pl.touristflightsmanager.app.service.FlightService;

import java.util.List;

@Service
public class FlightServiceImpl implements FlightService {

    @Autowired
    private FlightRepository repository;


    @Override
    public Flight create(Flight flight) {
        return repository.save(flight);
    }

    @Override
    public Flight getById(Long id){
        return repository.getOne(id);
    }

    @Override
    public Flight updateById(Long id, Flight flight) {
        return repository.save(Flight.builder().flightId(id).build());
    }

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }

    @Override
    public List<Flight> getAll() {
        return repository.findAll();
    }
}
