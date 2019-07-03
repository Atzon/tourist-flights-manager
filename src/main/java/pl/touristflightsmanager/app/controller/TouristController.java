package pl.touristflightsmanager.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import pl.touristflightsmanager.app.model.Tourist;
import pl.touristflightsmanager.app.service.TouristService;

import java.util.List;


@Controller
@RequestMapping(value = "/tourist")
public class TouristController {

    @Autowired
    private TouristService touristService;

    @GetMapping
    @CrossOrigin(maxAge = 3600)
    public ResponseEntity<List<Tourist>> getTourists() {
        return new ResponseEntity<>(touristService.getAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/{touristId}")
    @CrossOrigin(origins="*")
    public ResponseEntity<Tourist> getTourist(@PathVariable("touristId") long touristId) {
        return new ResponseEntity<>(touristService.getById(touristId), HttpStatus.OK);
    }

    @CrossOrigin(maxAge = 3600)
    @PostMapping
    public ResponseEntity<Tourist> postTourist(@RequestBody Tourist tourist) {
        return new ResponseEntity<>(touristService.create(tourist), HttpStatus.OK);

    }

    @CrossOrigin(maxAge = 3600)
    @PutMapping("/{touristId}")
    public ResponseEntity<Tourist> putFlight(@RequestBody Tourist tourist, @PathVariable Long touristId) {
        return new ResponseEntity<>(touristService.updateById(touristId, tourist), HttpStatus.OK);
    }

    @CrossOrigin(maxAge = 3600)
    @DeleteMapping("/{touristId}")
    public ResponseEntity deleteTourist(@PathVariable Long touristId) {
        touristService.deleteById(touristId);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
