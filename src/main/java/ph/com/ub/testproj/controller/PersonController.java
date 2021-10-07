package ph.com.ub.testproj.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ph.com.ub.testproj.database.PersonEntity;
import ph.com.ub.testproj.database.PersonRepository;

@RestController
@RequestMapping("/api/person")
@AllArgsConstructor
public class PersonController {

    private PersonRepository repository;

    @PostMapping("/add")
    public PersonEntity addPerson(PersonEntity request) {
        return repository.save(request);
    }

    @PostMapping("/edit")
    public PersonEntity editPerson(PersonEntity request) {
        var person = repository.getById(request.getId());
        var edit = editEntity(person, request);
        return repository.save(edit);
    }

    private PersonEntity editEntity(PersonEntity modify, PersonEntity paramsToReplace) {
        modify.setAge(paramsToReplace.getAge());
        modify.setFirstName(paramsToReplace.getFirstName());
        modify.setMiddleName(paramsToReplace.getMiddleName());
        modify.setLastName(paramsToReplace.getLastName());

        return modify;
    }
}
