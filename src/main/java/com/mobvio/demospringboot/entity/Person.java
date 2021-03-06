package com.mobvio.demospringboot.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author  chaowang
 *
 * @date  2018-11-5
 */

@Entity
@Table
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Person {
    @Id
    @GeneratedValue

    private  Integer id;
    private  String name;
    private  Integer age;



}
