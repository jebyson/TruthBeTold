package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the truth table creator!");

        System.out.println("Please input the A variable for the expression");
        String aVal = input.nextLine();
        System.out.println("Please input the A variable for the expression");
        String bVal = input.nextLine();
        System.out.println("Please input your control expression.");
        System.out.println("Input '&' for and, '|' for or, '!' for not, or '=' for equals.");
        String ctrlExp = input.nextLine();

        String trueVal = "T";
        String falseVal = "F";

        System.out.println("Here is your truth table:");

        if(ctrlExp.equals("&"))
        {
            System.out.println(aVal + "\t" + bVal + "\t" + aVal + ctrlExp + bVal);
            System.out.println(trueVal + "\t" + trueVal + "\t" + trueVal);
            System.out.println(trueVal + "\t" + falseVal + "\t" + falseVal);
            System.out.println(falseVal + "\t" + trueVal + "\t" + falseVal);
            System.out.println(falseVal + "\t" + falseVal + "\t" + falseVal);
        }
        else if(ctrlExp.equals("|"))
        {
            System.out.println(aVal + "\t" + bVal + "\t" + aVal + ctrlExp + bVal);
            System.out.println(trueVal + "\t" + trueVal + "\t" + trueVal);
            System.out.println(trueVal + "\t" + falseVal + "\t" + trueVal);
            System.out.println(falseVal + "\t" + trueVal + "\t" + trueVal);
            System.out.println(falseVal + "\t" + falseVal + "\t" + falseVal);
        }
        else if(ctrlExp.equals("!"))
        {
            System.out.println(aVal + "\t" + bVal + "\t" + aVal + ctrlExp + bVal);
            System.out.println(trueVal + "\t" + trueVal + "\t" + falseVal);
            System.out.println(trueVal + "\t" + falseVal + "\t" + trueVal);
            System.out.println(falseVal + "\t" + trueVal + "\t" + trueVal);
            System.out.println(falseVal + "\t" + falseVal + "\t" + falseVal);
        }
        if(ctrlExp.equals("="))
        {
            System.out.println(aVal + "\t" + bVal + "\t" + aVal + ctrlExp + bVal);
            System.out.println(trueVal + "\t" + trueVal + "\t" + trueVal);
            System.out.println(trueVal + "\t" + falseVal + "\t" + falseVal);
            System.out.println(falseVal + "\t" + trueVal + "\t" + falseVal);
            System.out.println(falseVal + "\t" + falseVal + "\t" + trueVal);
        }

    }
}
