package com.mobvio.demospringboot;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author  chao.wang
 *
 * @date 2018-11-2
 */
@Component
@ConfigurationProperties(prefix = "person")
public class PersonProperties {

    private String name;
    private Integer age;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
