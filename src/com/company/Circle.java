package com.company;

public class Ciircle {
    private static final double PI = Math.PI;

    public Ciircle() {
    }

    static void area(int radius) {
        System.out.println(PI * (radius * radius));

    }

    static void circumferen(int radius) {
        System.out.println(PI * 2 * radius);

    }
    //Circle деген класс тузунуз, анын PI деген свойствасы, area
//        жана circumference деген статик методдору болсун.
//        areaны табуу учун: PI * (radius * radius)
//        circumferenceти табуу учун PI * 2 * radius деген формулалар колдонулат
}
