package pl.touristflightsmanager.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.touristflightsmanager.app.model.Flight;

public interface FlightRepository extends JpaRepository<Flight, Long> {

}
