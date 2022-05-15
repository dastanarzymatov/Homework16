package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Circle area=new Circle();
        Random scanner=new Random();
        int pi= scanner.nextInt(1,10);
        System.out.println(pi);
        System.out.println("======AREA======");
        Circle.area(pi);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("======CIRCUMFENCE======");
        Circle.circumference(pi);


    }
}