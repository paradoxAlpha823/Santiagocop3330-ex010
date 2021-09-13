/*
 *  UCF COP3330 Fall 2021 Assignment 10 Solution
 *  Copyright 2021 Diego Santiago
 */


package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);

        //item 1
        System.out.print("Enter the price of item 1: ");
        String s1 = x.nextLine();
        Double num1 = null;
        try {
            num1 = Double.valueOf(s1);

        } catch (NumberFormatException exception) {
            System.out.print("Input only integer or double values please.");
            System.exit(0);
        }
        System.out.print("Enter the quantity of item 1: ");
        String s2 = x.nextLine();
        Double num2 = null;
        try {
            num2 = Double.valueOf(s2);

        } catch (NumberFormatException exception) {
            System.out.print("Input only integer or double values please.");
            System.exit(0);
        }

        //item 2
        System.out.print("Enter the price of item 2: ");
        String s3 = x.nextLine();
        Double num3 = null;
        try {
            num3 = Double.valueOf(s3);

        } catch (NumberFormatException exception) {
            System.out.print("Input only integer or double values please.");
            System.exit(0);
        }
        System.out.print("Enter the quantity of item 2: ");
        String s4 = x.nextLine();
        Double num4 = null;
        try {
            num4 = Double.valueOf(s4);

        } catch (NumberFormatException exception) {
            System.out.print("Input only integer or double values please.");
            System.exit(0);
        }

        //item 3
        System.out.print("Enter the price of item 3: ");
        String s5 = x.nextLine();
        Double num5 = null;
        try {
            num5 = Double.valueOf(s5);

        } catch (NumberFormatException exception) {
            System.out.print("Input only integer or double values please.");
            System.exit(0);
        }
        System.out.print("Enter the quantity of item 3: ");
        String s6 = x.nextLine();
        Double num6 = null;
        try {
            num6 = Double.valueOf(s6);

        } catch (NumberFormatException exception) {
            System.out.print("Input only integer or double values please.");
            System.exit(0);
        }


        double n1 = num1;
        double n2 = num2;
        double n3 = num3;
        double n4 = num4;
        double n5 = num5;
        double n6 = num6;

        double tn1 = n1*n2;
        double tn2 = n3*n4;
        double tn3 = n5*n6;

        double stot = tn1+tn2+tn3;
        double tax = stot*0.055;
        double tot = stot+tax;

        System.out.println("Subtotal: $"+stot);
        System.out.println("Tax: $"+tax);
        System.out.println("Total: $"+tot);

        System.exit(0);
    }
}
