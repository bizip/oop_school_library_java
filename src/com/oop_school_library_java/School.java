package com.oop_school_library_java;

public class School {
    public static void main(String[] args) {
        Person person1 = new Person(1, 25);
        System.out.println("Person 1:");
        System.out.println("ID: " + person1.getId());
        System.out.println("Name: " + person1.getName());
        System.out.println("Age: " + person1.getAge());
        System.out.println("Can use services: " + person1.canUseServices());

        Person person2 = new Person(2, 16, true, "Alice");
        System.out.println("Person 2:");
        System.out.println("ID: " + person2.getId());
        System.out.println("Name: " + person2.getName());
        System.out.println("Age: " + person2.getAge());
        System.out.println("Can use services: " + person2.canUseServices());

        person2.setAge(18);
        person2.setName("Alice Smith");
        System.out.println("Person 2 (after changes):");
        System.out.println("ID: " + person2.getId());
        System.out.println("Name: " + person2.getName());
        System.out.println("Age: " + person2.getAge());
        System.out.println("Can use services: " + person2.canUseServices());
    }
}
