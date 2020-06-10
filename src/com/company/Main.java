package com.company;

import java.awt.*;
import java.sql.SQLOutput;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /*Date now = new Date();
        now.getTime();


        String message = new String("Hello world");
        */

        float monthsPerYear = 12F;
        float yearsInLoan = 30F;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Principle: ");
        float principle  = scanner.nextFloat();

        System.out.print("Annual Interest Rate: ");
        float annualRate = scanner.nextFloat();

        System.out.print("Period (years): ");
        byte years = scanner.nextByte();

        float monthlyRate = annualRate / monthsPerYear / 100;
        float numberOfPayments = yearsInLoan * monthsPerYear;

        double equationTop = monthlyRate * (Math.pow(1 + monthlyRate, numberOfPayments)); //r(1 + r) ^n
        double equationBottom = Math.pow(1+ monthlyRate, numberOfPayments) -1;            //(1 + r)^n - 1
        double monthlyPayment = principle * (equationTop/equationBottom);

        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        String finalAnswer = formatter.format(monthlyPayment);

        System.out.print("The monthly payment will be: " + finalAnswer);

        /*
        String name = scanner.nextLine();

        System.out.println(age + " " + name);

         */
    }
}


//https://www.youtube.com/watch?v=eIrMbAQSU34 - 1:08:00