package org.example;

public class Main {
    public static void main(String[] args) {
        Building house1 = new Building("tree","2022","piles");
        System.out.println(house1);
        Building factoryMilk = new Factory("tree","2021","piles","milk",3);
        System.out.println(factoryMilk);


    }
}