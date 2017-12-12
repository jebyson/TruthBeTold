package com.company;

public class TruthTables {

    private char a = 'A';
    private char b = 'B';
    private String trueVal = "T";
    private String falseVal = "F";
    private String blank = "";

    public String and()
    {
        System.out.println(trueVal + "\t" + trueVal + "\t" + trueVal);
        System.out.println(trueVal + "\t" + falseVal + "\t" + falseVal);
        System.out.println(falseVal + "\t" + trueVal + "\t" + falseVal);
        System.out.println(falseVal + "\t" + falseVal + "\t" + falseVal);
        return blank;
    }

    public String or()
    {
        System.out.println(trueVal + "\t" + trueVal + "\t" + trueVal);
        System.out.println(trueVal + "\t" + falseVal + "\t" + trueVal);
        System.out.println(falseVal + "\t" + trueVal + "\t" + trueVal);
        System.out.println(falseVal + "\t" + falseVal + "\t" + falseVal);
        return blank;
    }

    public String not()
    {
        System.out.println(trueVal + "\t" + trueVal + "\t" + falseVal);
        System.out.println(trueVal + "\t" + falseVal + "\t" + trueVal);
        System.out.println(falseVal + "\t" + trueVal + "\t" + trueVal);
        System.out.println(falseVal + "\t" + falseVal + "\t" + falseVal);
        return blank;
    }

    public String equal()
    {
        System.out.println(trueVal + "\t" + trueVal + "\t" + trueVal);
        System.out.println(trueVal + "\t" + falseVal + "\t" + falseVal);
        System.out.println(falseVal + "\t" + trueVal + "\t" + falseVal);
        System.out.println(falseVal + "\t" + falseVal + "\t" + trueVal);
        return blank;
    }
}