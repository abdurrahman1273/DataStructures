package com.abdurrahman;
import java.util.LinkedList;
import java.util.ListIterator;

public class WorkingWithLinkedList {
    public static void main(String[] args){
        LinkedList<Person> Linkedlist=new LinkedList<>();
        Linkedlist.add(new Person("Mehmet",23));
        Linkedlist.add(new Person("Abdurrahman",28));
        Linkedlist.add(new Person("Turhan",41));
        Linkedlist.add(new Person("Ali",33));


        ListIterator<Person> personListIterator=Linkedlist.listIterator();
        while (personListIterator.hasNext()){
            System.out.println(personListIterator.next());
        }


        System.out.println("**************************");

        while (personListIterator.hasPrevious()){
            System.out.println(personListIterator.previous());
        }

        /*
        System.out.println(Linkedlist);
        System.out.println(Linkedlist.size());
        System.out.println(Linkedlist.getFirst());
        System.out.println(Linkedlist.getLast());
        */


    }
    static record Person(String name,int age){

    }
}
