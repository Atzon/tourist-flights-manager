package pl.touristflightsmanager.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import pl.touristflightsmanager.app.model.Flight;
import pl.touristflightsmanager.app.service.FlightService;

import java.util.List;

@Controller
@RequestMapping(value = "/flight")
public class FlightsController {

    @Autowired
    private FlightService flightService;

    @GetMapping
    @CrossOrigin(maxAge = 3600)
    public ResponseEntity<List<Flight>> getFlights() {
        return new ResponseEntity<>(flightService.getAll(), HttpStatus.OK);
    }

    @CrossOrigin(maxAge = 3600)
    @GetMapping(value = "/{flightId}")
    public ResponseEntity<Flight> getTourist(@PathVariable("flightId") long flightId) {
        return new ResponseEntity<>(flightService.getById(flightId), HttpStatus.OK);
    }

    @CrossOrigin(maxAge = 3600)
    @PostMapping
    public ResponseEntity<Flight> postFlight(@RequestBody Flight flight) {
        return new ResponseEntity<>(flightService.create(flight), HttpStatus.OK);
    }

    @CrossOrigin(maxAge = 3600)
    @PutMapping("/{flightId}")
    public ResponseEntity<Flight> putFlight(@RequestBody Flight flight, @PathVariable Long flightId) {
        return new ResponseEntity<>(flightService.updateById(flightId, flight), HttpStatus.OK);
    }

    @CrossOrigin(maxAge = 3600)
    @DeleteMapping("/{flightId}")
    public ResponseEntity deleteFlight(@PathVariable Long flightId) {
        flightService.deleteById(flightId);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
