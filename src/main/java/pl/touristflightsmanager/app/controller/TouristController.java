package pl.touristflightsmanager.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.touristflightsmanager.app.model.Tourist;
import pl.touristflightsmanager.app.service.TouristService;

import java.util.List;


@Controller
@RequestMapping(value = "/tourist")
public class TouristController {

    @Autowired
    private TouristService touristService;

    @CrossOrigin(maxAge = 3600)
    @GetMapping
    public ResponseEntity<List<Tourist>> getClassrooms() {
        List<Tourist> touristList;
        try {
            touristList = touristService.getAll();
        } catch (ResourceNotFoundException ex) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(touristList, HttpStatus.OK);
    }

    @CrossOrigin(maxAge = 3600)
    @GetMapping(value = "/{touristId}")
    public ResponseEntity<Tourist> getClassroom(@PathVariable("touristId") long touristId) {
        Tourist tourist;
        try {
            tourist = touristService.getById(touristId);
        } catch (ResourceNotFoundException ex) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(tourist, HttpStatus.OK);
    }
}
