package com.abdurrahman;

import java.util.HashMap;
import java.util.Map;

public class WorkingWithMap {
    public static void main(String[] args){
        Map<Integer,Person> map= new HashMap<>();
        map.put(1,new Person("Alex"));
        map.put(2,new Person("Mariam"));
        map.put(3,new Person("James"));
        map.put(3,new Person("Adrian")); //When the key value is the same, it is override and the last one is printed....

        System.out.println(map);
        System.out.println(map.size());
        System.out.println(map.get(2)); ///Returns the key value of 2....
        System.out.println(map.keySet());  //Prints key values...
        System.out.println(map.entrySet());
    }
    record Person(String name){

    }
}
