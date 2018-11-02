package com.mobvio.demospringboot.controller;

import com.mobvio.demospringboot.PersonProperties;
import com.mobvio.demospringboot.dao.PersonRepository;
import com.mobvio.demospringboot.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author chao.wang
 *
 * 2018-11-2
 */
@RestController
public class PersonController {

    @Autowired
    PersonRepository personRepository;

    @GetMapping(value = "/person")
    private List<Person> personList(){
        return personRepository.findAll();
    }
}
