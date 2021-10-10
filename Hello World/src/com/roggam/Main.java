package com.roggam;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
     public static String mortgage(){
         // write your code here

         Scanner scanner = new Scanner(System.in);
         System.out.print("Principal: ");
         double principal = scanner.nextDouble();


         System.out.print("Annual Interest rate: ");
         double  Interest = scanner.nextDouble();
         Interest = (Interest / 100) / 12;

         System.out.print("Period of Years: ");
         double  loanYears = scanner.nextDouble();
         loanYears = loanYears * 12;

         double Mortgage = (principal * Interest) / (1 - Math.pow(1 + Interest, -loanYears));
         String result = NumberFormat.getCurrencyInstance().format(Mortgage);

         //System.out.println(result);

         return ("Your Monthly payment will be " + result);


     }
    public static void main(String[] args) {
        System.out.println(mortgage());

    }

}

