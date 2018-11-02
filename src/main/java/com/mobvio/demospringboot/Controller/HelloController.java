package com.mobvio.demospringboot.Controller;

import com.mobvio.demospringboot.PersonProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * chao.wang
 * 2018-11-02
 *
 */

@RestController
public class HelloController {

    @Autowired
    private PersonProperties personProperties;

    @RequestMapping("/hello")
    public String say(){
        return personProperties.getName() + personProperties.getAge();
    }
}
