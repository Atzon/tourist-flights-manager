package pl.touristflightsmanager.app.service;

import pl.touristflightsmanager.app.model.Flight;

import java.util.List;

public interface FlightService {
    Flight create(Flight flight);
    List<Flight> getAll();
}
