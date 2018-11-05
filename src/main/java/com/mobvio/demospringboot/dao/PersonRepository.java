package com.mobvio.demospringboot.dao;

import com.mobvio.demospringboot.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author   chao wang
 *
 * @date  2018-11-5
 *
 */

public interface PersonRepository extends JpaRepository<Person, Integer> {


    /**
     * 通过年龄来查询
     * @param age
     * @return
     */
    public List<Person> findByAge(Integer age);

}
