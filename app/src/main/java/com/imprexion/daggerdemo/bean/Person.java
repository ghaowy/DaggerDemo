package com.imprexion.daggerdemo.bean;

/**
 * @author : yan
 * @date : 2019/12/2 10:43
 * @desc : TODO
 */
public class Person {

    private String name;
    private int age;

    public Person() {
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
