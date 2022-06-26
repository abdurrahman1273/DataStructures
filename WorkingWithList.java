package com.abdurrahman;

import java.util.ArrayList;
import java.util.List;

public class WorkingWithList {
    public static void main(String[] args){
        List<String> colors= new ArrayList<>();
        colors.add("Blue");
        colors.add("Purple");
        colors.add("Yellow");
        colors.add("Yellow");
        System.out.println(colors);
        System.out.println(colors.size());

        System.out.println(colors.contains("Yellow"));//Checks if Yellow is in the list.
        System.out.println(colors.contains("Green")); //Checks if Green is in the list.
        for (String color:colors){
            System.out.print(color);
        }
    }
}
