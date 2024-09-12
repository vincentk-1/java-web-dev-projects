package org.launchcode;

import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the length of a rectangle:");
        double length = input.nextDouble();

        System.out.println("Enter the width of a rectangle:");
        double width = input.nextDouble();

        double rectangleArea = length * width;
        System.out.println("The area of the rectangle is: " + rectangleArea );
    }
}
