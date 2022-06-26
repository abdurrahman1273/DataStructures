package com.abdurrahman;

import java.util.LinkedList;
import java.util.Queue;

public class WorkingWithQueuses {
    public static void main(String[] args){
        Queue<Person> supermarket= new LinkedList<>();

        supermarket.add(new Person("Abdurrahman",22));
        supermarket.add(new Person("Alex",24));
        supermarket.add(new Person("James",29));
        supermarket.add(new Person("Mariam",34));

        System.out.println(supermarket.peek());  //Listing The First Element
        System.out.println(supermarket.size());
        System.out.println(supermarket.poll()); //Removing The First Element
        System.out.println(supermarket.peek());
        System.out.println(supermarket); //Listing the All elements....

    }
    static record Person(String name, int age){

    }
}
