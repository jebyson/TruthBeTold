package com.company;

public class TruthTables {

    private char a = 'A';
    private char b = 'B';
    private String trueVal = "T";
    private String falseVal = "F";

    public void and()
    {
        System.out.println(trueVal + "\t" + trueVal + "\t" + trueVal);
        System.out.println(trueVal + "\t" + falseVal + "\t" + falseVal);
        System.out.println(falseVal + "\t" + trueVal + "\t" + falseVal);
        System.out.println(falseVal + "\t" + falseVal + "\t" + falseVal);
    }

    public void or()
    {
        System.out.println(trueVal + "\t" + trueVal + "\t" + trueVal);
        System.out.println(trueVal + "\t" + falseVal + "\t" + trueVal);
        System.out.println(falseVal + "\t" + trueVal + "\t" + trueVal);
        System.out.println(falseVal + "\t" + falseVal + "\t" + falseVal);
    }

    public void not()
    {
        System.out.println(trueVal + "\t" + trueVal + "\t" + falseVal);
        System.out.println(trueVal + "\t" + falseVal + "\t" + trueVal);
        System.out.println(falseVal + "\t" + trueVal + "\t" + falseVal);
        System.out.println(falseVal + "\t" + falseVal + "\t" + falseVal);
    }

    public void equal()
    {
        System.out.println(trueVal + "\t" + trueVal + "\t" + trueVal);
        System.out.println(trueVal + "\t" + falseVal + "\t" + falseVal);
        System.out.println(falseVal + "\t" + trueVal + "\t" + falseVal);
        System.out.println(falseVal + "\t" + falseVal + "\t" + trueVal);
    }
}