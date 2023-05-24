package Quittance.EmissionQuittance.critaria.service;

import Quittance.EmissionQuittance.critaria.entity.PersonSearchCriteria;
import Quittance.EmissionQuittance.critaria.dto.PersonDTO;
import Quittance.EmissionQuittance.critaria.mapper.PersonMapper;
import Quittance.EmissionQuittance.critaria.repo.PersonRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import org.springframework.data.domain.Pageable;
import org.springframework.util.StringUtils;

import java.util.Random;

@Service
    public class PersonServiceImpl {
    private   PersonRepository personRepository;
    private   PersonMapper personMapper;

    public PersonServiceImpl(PersonRepository personRepository, PersonMapper personMapper) {
        this.personRepository = personRepository;
        this.personMapper = personMapper;
    }





    public Page<PersonDTO> searchByCriteria(String firstName, String lastName, String email, Pageable pageable) {
        if (StringUtils.isEmpty(firstName) && StringUtils.isEmpty(lastName) && StringUtils.isEmpty(email)) {
            // Fetch all data without search criteria
            return personRepository.findAll(pageable).map(personMapper::toDto);
        } else {
        Page<PersonSearchCriteria> persons = personRepository.findByFirstNameContainingOrLastNameContainingOrEmailContaining(
                firstName, lastName, email, pageable);
        return persons.map(personMapper::toDto);}
    }

    public PersonDTO savePerson(PersonDTO personDTO) {
        Random random = new Random();
        for (int i =0;i<1000;i++){
        PersonSearchCriteria person = personMapper.toEntity(personDTO);
            person.setFirstName(personDTO.getFirstName()+i);
            person.setLastName(personDTO.getLastName()+random.nextInt(1000));
            person.setEmail(personDTO.getEmail()+random.nextInt(1000)+random.nextInt(1000));
        PersonSearchCriteria savedPerson = personRepository.save(person);
         personMapper.toDto(savedPerson);
        }
        return null;
    }


}
