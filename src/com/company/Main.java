package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        TruthTables test = new TruthTables();

        for(int j = 0; j < 1; j+=0)
        {
            Scanner input = new Scanner(System.in);
            System.out.println("Welcome to the truth table creator!");

            char a = 'A';
            char b = 'B';

            System.out.println("Please input your control expression.");
            System.out.println("Input '&' for and, '|' for or, '!' for not, or '=' for equals.");
            String ctrlExp = input.nextLine();

            if(ctrlExp.equals("&"))
            {
                System.out.println("\nHere is your truth table:");
                System.out.println(a + "\t" + b + "\t" + a + ctrlExp + ctrlExp + b);
                test.and();
            }
            else if(ctrlExp.equals("|"))
            {
                System.out.println("\nHere is your truth table:");
                System.out.println(a + "\t" + b + "\t" + a + ctrlExp + ctrlExp + b);
                test.or();
            }
            else if(ctrlExp.equals("!"))
            {
                System.out.println("\nHere is your truth table:");
                System.out.println(a + "\t" + b + "\t" + a + "&&" + ctrlExp + b);
                test.not();
            }
            else if(ctrlExp.equals("="))
            {
                System.out.println("\nHere is your truth table:");
                System.out.println(a + "\t" + b + "\t" + a + ctrlExp + ctrlExp + b);
                test.equal();
            }
            else
            {
                System.out.println("Sorry, that is an invalid expression. Goodbye!");
                break;
            }

            System.out.println("\nEnter '0' if you would like to try again. Enter '1' if you would like to exit.");
            String continueOrNot = input.next();
            if(continueOrNot.equals("0"))
            {
                System.out.println("Thank you for playing again!\n");
            }
            else if(continueOrNot.equals("1"))
            {
                System.out.println("Goodbye!");
                j++;
            }
            else
            {
                System.out.println("Sorry, that is an invalid input. Goodbye!");
                j++;
            }
        }
    }
}