package com.mobvio.demospringboot.controller;


import com.mobvio.demospringboot.dao.PersonRepository;
import com.mobvio.demospringboot.entity.Person;
import com.mobvio.demospringboot.service.PerosnService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @Autowired
    private PerosnService perosnService;

    /**
     *    查询所有人员功能
     * @return
     */
    @GetMapping(value = "/person")
    private List<Person> personList(){
        return personRepository.findAll();
    }

    /**
     *
     * 添加一个人员
     * @param  name
     * @param  age
     */
    @PostMapping(value = "/person")
    public Person personAdd(@RequestParam("name") String name, @RequestParam("age") Integer age){
        Person person = new Person();
        person.setAge(age);
        person.setName(name);
        return personRepository.save(person);
    }
    /**
     * 查询一个人员
     * @param  ID
     * @return
     *
     */
    @GetMapping(value = "/person/{id}")
    public Person personFindOne(@PathVariable("id") Integer id) {
        return personRepository.findById(id).orElse(null);
    }
    /**
     *
     * 删除一个人员
     * @param id
     */

    @DeleteMapping(value = "/person/{id}")
    public void personDeleteOne(@PathVariable("id") Integer id){
          personRepository.deleteById(id);
    }

    /**
     *更新一个人员
     *
     * @param  id
     * @param  name
     * @param  age
     *
     */

    @PutMapping(value = "/person/{id}")
    public Person personUpdate(@PathVariable("id") Integer id,
                               @RequestParam("name") String name,
                               @RequestParam("age") Integer age){
        Person person = new Person();
        person.setId(id);
        person.setName(name);
        person.setAge(age);

       return  personRepository.save(person);
    }
    /**
     *
     * 通过年龄来查询
     * @param age
     * @return
     */
     @GetMapping(value = "/person/age/{age}")
     public List<Person> personListByAge(@PathVariable Integer age){
         return personRepository.findByAge(age);
     }

    /**
     * 事物测试
     *
     */
     @PostMapping("/person/two")
    public void personTwo(){
        perosnService.insertTwo();
     }
}
