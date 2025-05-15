package com.manigandan.assignment2;
import java.util.Scanner;

class Circle {
    double radius;
    String color;

    void getInput() {
        Scanner sc = new Scanner(System.in);
        radius = sc.nextDouble();
        sc.nextLine();
        color = sc.nextLine();
    }

    void calcArea() {
        double area = 3.1416 * radius * radius;
        System.out.println("Area: " + area);
    }
}



