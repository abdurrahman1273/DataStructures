package com.abdurrahman;

import java.util.HashSet;
import java.util.Set;

public class WorkingWithSet {
    public static void main(String[] args){
        Set<Ball> balls= new HashSet<>();
        balls.add(new Ball("Blue"));
        balls.add(new Ball("Yellow"));
        balls.add(new Ball("Red"));
        balls.add(new Ball("Blue"));  //ıt didn't write the blue one because there were 2 blue ones and ıt didn't count...

        System.out.println(balls.size());
        balls.forEach(System.out::println);
    }
    record Ball(String color){}

}
