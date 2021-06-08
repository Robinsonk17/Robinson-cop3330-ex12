package oop.exercises;
import java.util.Scanner;
/*
 * UCF cop3330 Summer 2021 Assignment 1 solutions
 * Copyright 2021 Keondez Robinson
 */
public class Main
{
   public static void main(String[] args)
   {
       int years;
       double principal, rate, interest, rateFinal;
       Scanner input;

       input = new Scanner(System.in);

       System.out.print("Enter the principal: ");
       principal = input.nextDouble();
       System.out.print("Enter the rate of interest: ");
       rate = input.nextDouble();
       System.out.print("Enter the number of years: ");
       years = input.nextInt();

       rateFinal = rate / 100;

       interest = principal * (1 + (rateFinal * years));
       System.out.print("After " + years + " Years at " + rate + "%, the investment will be worth $" +interest + "." );
   }
}
