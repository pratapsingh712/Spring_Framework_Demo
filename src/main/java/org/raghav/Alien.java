package org.raghav;

public class Alien {

    int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("Setter called from spring.xml");
        this.age = age;
    }

    public Alien(){
        System.out.println("Objected created:");
    }

    public void code(){
        System.out.println("Coding!");
    }
}
