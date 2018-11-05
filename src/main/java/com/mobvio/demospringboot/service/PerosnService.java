package com.mobvio.demospringboot.service;


import com.mobvio.demospringboot.dao.PersonRepository;
import com.mobvio.demospringboot.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

/**
 *
 * @author  chao.wang
 * @Date 2018-11-2
 *
 *
 */

@Service
public class PerosnService {

    @Autowired
    PersonRepository personRepository;

    @Transactional(rollbackOn = Exception.class)
    public void  insertTwo(){

        Person personA = new Person();
        personA.setAge(12);
        personA.setName("海淀");
        personRepository.save(personA);

        System.out.print("--------");

        Person personB = new Person();
        personB.setName("朝阳");
        personB.setAge(23);
        personRepository.save(personB);

    }
}
