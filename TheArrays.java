package com.abdurrahman;

import java.awt.*;
import java.lang.reflect.Array;
import java.util.Arrays;

public class TheArrays {
    public static void main(String[] args){
        String[] colors=new String[5];
        colors[0]="Purple";
        colors[1]="Blue";
        colors[2]="Red";

        System.out.println(Arrays.toString(colors));
        System.out.println(colors[1]);
        System.out.println(colors[2]); ///2.index
        System.out.println(colors[4]); ///İt is a Null

        colors[2]="Yellow";
        System.out.println(Arrays.toString(colors));

        int[] numbers={100,200,400,500};
        System.out.println(Arrays.toString(numbers));


        String[] cars=new String[4];
        cars[0]="Volvo";
        cars[1]="BMW";
        cars[2]="Audi";


        for(int i=0; i<colors.length; i++){
            System.out.println(colors[i]);
        }

        for(int i=cars.length-1;i>=0; i--){
            System.out.println(cars[i]);
        }

        for(String color: colors){
            System.out.print(color);
        }

    }

}
