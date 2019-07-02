package pl.touristflightsmanager.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.touristflightsmanager.app.model.Tourist;

public interface TouristRepository  extends JpaRepository<Tourist, Long> {

}
