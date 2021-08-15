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
     * @param lineNum coordinate of lines
     * @return length of line
     */
    public static double lineLength(int lineNum) {

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
        System.out.println("Length of Line-" + lineNum + " = " + length + "unit");

        return length;
    }

    /**
     * Purpose - Give final output
     */
    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Program");

        System.out.println("Enter coordinate of line-1");
        lineLength(1);
    }
}