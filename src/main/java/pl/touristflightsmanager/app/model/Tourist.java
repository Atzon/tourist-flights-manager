package pl.touristflightsmanager.app.model;

import lombok.*;
import org.springframework.data.rest.core.annotation.RestResource;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Tourist")
@Builder(toBuilder = true)
@AllArgsConstructor(access = AccessLevel.PACKAGE)
@NoArgsConstructor(access = AccessLevel.PACKAGE)
@Setter(value = AccessLevel.PACKAGE)
@Getter
public class Tourist {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long touristId;
    private String name;
    private String surname;
    private String gender;
    private String country;
    private String notes;
    private String birthdate;


    @ManyToMany(cascade = {CascadeType.ALL})
    @JoinTable(name = "Flight_Tourist",
            joinColumns = @JoinColumn(name = "touristId"),
            inverseJoinColumns = @JoinColumn(name = "flightId")
    )
    @RestResource(exported = false)
    private List<Flight> flightList = new ArrayList<>();
}
