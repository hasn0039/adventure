package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String direction = input.next();
        switch (direction){
            case "east":
                System.out.println("going east");
                break;
            case "West":
                System.out.println("going west");
                break;
            case "north":
                System.out.println("going north");
                break;
            case "south":
                System.out.println("going south");
                break;
            default:
                System.out.println("invalid answer, please type a direction");

        }
    }
}
