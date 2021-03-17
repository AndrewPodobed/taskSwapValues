package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	int a, b, c;
        Scanner val = new Scanner(System.in);
        System.out.println("Enter your values");
        a = val.nextInt();
        b = val.nextInt();
        System.out.println("You entered values: a " + a + " and b " + b);
        c = a;
        a = b;
        b = c;

        System.out.println("The result of the program:");
        System.out.println("values a is: " + a + "\n" + "values b is: " + b);

    }
}
