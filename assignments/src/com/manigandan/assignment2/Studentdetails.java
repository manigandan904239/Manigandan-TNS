package com.manigandan.assignment2;

import java.util.Scanner;

public class Studentdetails {
    @SuppressWarnings("resource")
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        String rollNumber = sc.nextLine();
        String grade = sc.nextLine();
        String percentage = sc.nextLine();

        System.out.println(name);
        System.out.println(rollNumber);
        System.out.println("\t" + grade);
        System.out.println("\t\t" + percentage);
    }
}
