package pl.touristflightsmanager.app.model;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "Flight")
@Builder(toBuilder = true)
@AllArgsConstructor(access = AccessLevel.PACKAGE)
@NoArgsConstructor(access = AccessLevel.PACKAGE)
@Setter(value = AccessLevel.PACKAGE)
@Getter
public class Flight {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long flightId;
    private Date departureDatetime;
    private Date arrivalDatetime;
    private Long numberOfSeats;
    private Double ticketPrice;

    @ManyToMany(mappedBy = "flightList")
    private List<Tourist> touristList = new ArrayList<>();
}
