package org.launchcode.java.studios.areaofacircle;
import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is the radius of the circle? ");
        double radius = input.nextDouble();

        double pi = 3.14;
//        double areaOfCircle = pi * radius * radius;
        double areaOfCircle = Circle.getArea(radius);
        // grabbed from Circle Class
        System.out.println("The area of a circle of radius " + radius + " is: " + areaOfCircle);
    }
}
