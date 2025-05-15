package com.manigandan.assignment2;

import java.util.Scanner;
public class Student
{
    Student() {
        System.out.println("Student object is created");
    }
}

class Commission {
    String name, address, phone;
    double salesAmount;

    void acceptDetails() {
        try (Scanner sc = new Scanner(System.in)) {
			name = sc.nextLine();
			address = sc.nextLine();
			phone = sc.nextLine();
			salesAmount = sc.nextDouble();
		}
    }

    void calculateCommission() {
        double commission = 0;
        if (salesAmount >= 100000) {
            commission = salesAmount * 0.10;
        } else if (salesAmount >= 50000) {
            commission = salesAmount * 0.05;
        } else if (salesAmount >= 30000) {
            commission = salesAmount * 0.03;
        }
        System.out.println("Commission: " + commission);
    }
}



