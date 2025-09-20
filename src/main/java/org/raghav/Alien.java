package org.raghav;

import java.beans.ConstructorProperties;

public class Alien {

    private int age;
//    private Laptop lap = new Laptop(); I don't want to create object by myself so I have set the property in the spring.xml for laptop as ref type
    private Laptop lap;

    public Alien(){
        System.out.println("Objected created:");
    }

    @ConstructorProperties({"age","lap"})
    public Alien(int age, Laptop lap) {
        this.age = age;
        this.lap = lap;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("Setter called from spring.xml");
        this.age = age;
    }

    public Laptop getLap() {
        return lap;
    }

    public void setLap(Laptop lap) {
        this.lap = lap;
    }

    public void code(){
        System.out.println("Coding!");
        lap.compile();
    }
}
