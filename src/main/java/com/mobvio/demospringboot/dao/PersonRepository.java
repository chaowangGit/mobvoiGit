package com.mobvio.demospringboot.dao;

import com.mobvio.demospringboot.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Integer> {

}
