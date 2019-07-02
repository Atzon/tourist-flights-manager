package pl.touristflightsmanager.app.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.touristflightsmanager.app.model.Flight;
import pl.touristflightsmanager.app.repository.FlightRepository;
import pl.touristflightsmanager.app.service.FlightService;

import java.util.List;

@Service
public class FlightServiceImpl implements FlightService {

    @Autowired
    private FlightRepository repository;


    @Override
    public Flight create(Flight flight) {
        return null;
    }

    @Override
    public List<Flight> getAll() {
        return null;
    }
}
