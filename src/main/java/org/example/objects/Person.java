package org.example.objects;

import lombok.Data;


@Data
public class Person implements Comparable<Person>{
// for test
Integer key;
    private String name;
    private int age;




    public Person(String name, int age) {
        this.name = name;
        this.age = age;

    }

    public Person(Integer key, String name, int age) {
        this.name = name;
        this.age = age;
        this.key=key;



    }

    @Override
    public int compareTo(Person o) {
        if (this.age == o.age) {
            return 0;
        } else if (this.age < o.age) {
            return -1;
        } else {
            return 1;
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
