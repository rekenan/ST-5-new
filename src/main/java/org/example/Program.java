package org.example;

/**
 * Hello world!
 *
 */
class Program
{
    public static void main(String[] args)
    {
        double val=Double.parseDouble("2.0");
        Sqrt sqrt=new Sqrt(val);
        double result=sqrt.calc();
        System.out.println("Sqrt of " + val + " = " + result);
    }
}