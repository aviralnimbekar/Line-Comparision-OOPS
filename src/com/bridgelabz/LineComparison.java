package com.bridgelabz;

import java.util.Scanner;

/**
 * Purpose - Program for modeling of line and comparing length of two lines
 *
 * @author - Aviral N
 */
public class LineComparison {

    /**
     * Purpose - Modeling of line
     *
     * @return length of line
     */
    public static double lineLength() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x1 point");
        int x1 = sc.nextInt();
        System.out.println("Enter y1 point");
        int y1 = sc.nextInt();
        System.out.println("Enter x2 point");
        int x2 = sc.nextInt();
        System.out.println("Enter y2 point");
        int y2 = sc.nextInt();

        int X = x2 - x1;
        int Y = y2 - y1;
        double length = Math.sqrt((X * X) + (Y * Y));

        return length;
    }

    /**
     * Purpose - shows equality of two line
     */
    public static void comparison(double lengthA, double lengthB) {

        if (lengthA == lengthB)
            System.out.println("Line1 is equal to Line2");
        else
            System.out.println("Line1 is not equal to Line2");
    }

    /**
     * Purpose - Give final output
     */
    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Program");

        System.out.println("Enter coordinate of line-1");
        double length1 = lineLength();
        System.out.println("Enter coordinate of line-2");
        double length2 = lineLength();
        System.out.println("Length of Line-1 = " + length1 + "\n"
                + "Length of Line-2 = " + length2);

        comparison(length1, length2);
    }
}