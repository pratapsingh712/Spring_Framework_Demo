package org.raghav;

import org.springframework.stereotype.Component;

import java.beans.ConstructorProperties;

@Component
public class Alien {

    private int age;
//    private Laptop lap = new Laptop(); I don't want to create object by myself so I have set the property in the spring.xml for laptop as ref type
//    private Laptop lap;

    private Computer com;

    public Alien(){
        System.out.println("Alien Objected created:");
    }

    public Alien(int age, Computer com) {
        this.age = age;
        this.com = com;
    }

    //    @ConstructorProperties({"age","lap"})
//    public Alien(int age, Laptop lap) {
//        this.age = age;
//        this.lap = lap;
//    }

    public Computer getCom() {
        return com;
    }

    public void setCom(Computer com) {
        this.com = com;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("Setter called from spring.xml");
        this.age = age;
    }


    public void code(){
        System.out.println("Coding!");
        com.compile();
    }
}
