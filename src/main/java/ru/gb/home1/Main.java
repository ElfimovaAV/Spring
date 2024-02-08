package ru.gb.home1;

import ru.gb.home1.domain.Person;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Marina", "Orlova", 15);
        Person person2 = new Person("Philipp", "Troekurov", 33);
        Person person3 = new Person("Lubov'", "Golubeva", 51);
        Person person4 = new Person("Lubov'", "Golubeva", 51);

        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);
        System.out.println(person4);
        System.out.println();
        System.out.println("Hashcode " + person1.getFirstName() + ": " + person1.hashCode());
        System.out.println("Hashcode " + person2.getFirstName() + ": " + person2.hashCode());
        System.out.println("Hashcode " + person3.getFirstName() + ": " + person3.hashCode());
        System.out.println("Hashcode " + person4.getFirstName() + ": " + person4.hashCode());
        System.out.println();
        System.out.println("person3 и person4 равны: " + person3.equals(person4));
        System.out.println("person3 и person1 равны: " + person3.equals(person1));


    }
}
