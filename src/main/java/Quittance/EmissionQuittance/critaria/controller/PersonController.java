package Quittance.EmissionQuittance.critaria.controller;


import Quittance.EmissionQuittance.critaria.dto.PersonDTO;
import Quittance.EmissionQuittance.critaria.service.PersonServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import org.springframework.data.domain.Pageable;

@RestController
@RequestMapping("/persons")
public class PersonController {

    @Autowired
    private   PersonServiceImpl personService;



    @GetMapping("/search")
    public Page<PersonDTO> searchPersons(@RequestParam(required = false) String firstName,
                                         @RequestParam(required = false) String lastName,
                                         @RequestParam(required = false) String email,
                                         Pageable pageable) {
        return personService.searchByCriteria(firstName, lastName, email, pageable);
    }

    @PostMapping
    public ResponseEntity<PersonDTO> savePerson(@RequestBody PersonDTO personDTO) {
        PersonDTO savedPerson = personService.savePerson(personDTO);
        return new ResponseEntity<>(savedPerson, HttpStatus.CREATED);
    }
}
