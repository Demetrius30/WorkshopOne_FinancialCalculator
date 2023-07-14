package com.dm;

import java.util.Scanner;

import java.text.DecimalFormat;
public class FinancialCalculator {

    static Scanner myScanner = new Scanner(System.in);
    public static void main(String[] args) {

        String input;
        do {
            System.out.println(" Financial Calculators: ");
            System.out.println("\t1: Mortgage Calculator");
            System.out.println("\t2: Future Value Calculator");
            System.out.println("\t3: Present Value Calculator");
            System.out.println("\t4: Exit Calculator");
            System.out.println("Command: ");
            input = myScanner.nextLine();

            switch (input) {
                case "1":
                    mortgageCalc();
                    break;
                case "2":
                    cdInterestCalc();
                    break;
                case "3":
                    presentValueCalc();
                    break;
                default:
                    System.out.println("Invalid Input");
            }
        }while (!input.equalsIgnoreCase("4"));
    }


        public static void mortgageCalc() {

            System.out.println("What is the principal: ");
            double principalRes = myScanner.nextDouble(); // Principal response


            System.out.println("What is your interest rate: ");
            double annualInterestRate = myScanner.nextDouble(); // Interest rate response
            double monthlyInterestRate =  annualInterestRate / 12 / 100;


            System.out.println("What is the length of the loan in years: ");
            int loanLengthInYears = myScanner.nextInt(); // loan length response in years
            int loanLengthInMonths = loanLengthInYears * 12;

//            int numOfPayments = loanLengthRes * 12;

//            double monthlyPayment = principalRes * (interestRateRes * Math.pow(1 + interestRateRes, numOfPayments))
//                    / (Math.pow(1 + interestRateRes, numOfPayments) - 1);

//            double totalInterestPaid = (monthlyPayment * numOfPayments) - principalRes;

            double monthlyPayment = (monthlyInterestRate * principalRes) / (1 - Math.pow(1 + monthlyInterestRate, loanLengthInMonths));
            double totalInterestPaid = (monthlyPayment * loanLengthInMonths) - principalRes;


            System.out.println("Your monthly payment: $" + String.format("%.2f", monthlyPayment));
            System.out.printf("Total interest paid: $" + String.format("%.2f", totalInterestPaid));

        }

        public static void cdInterestCalc(){

            System.out.println("Input deposit amount: ");
            double depositAmount = myScanner.nextDouble(); // Deposit Response

            System.out.println("Input your interest rate %: ");
            double interestRate = myScanner.nextDouble(); // Interest rate response

            System.out.println("Input number of years: ");
            int years = myScanner.nextInt(); // How long if in years response

            double interestRatePerPeriod = interestRate / 36500;
            int period = years * 365;
            double futureValue =  depositAmount * Math.pow(1 + interestRatePerPeriod, period);
            double earnedInterest = futureValue - depositAmount;

            System.out.printf("If you put in $%.2f in a CD that earns %.2f%% interest and interest and matures in %d years,%n",
                    depositAmount, interestRate, years);
            System.out.printf("CD ending balance is $%.2f and you have earned $%2f in interest%n", futureValue, interestRate);


        }

        public static void presentValueCalc(){

        System.out.println("Monthly payout amount: ");
        double monthlyPayment = myScanner.nextDouble();

        System.out.println("Annual interest rate %: ");
        double interestRate = myScanner.nextDouble() / 100;

        System.out.println("Years of payout: ");
        int years = myScanner.nextInt();
        int months = years * 12;

        double monthlyInterestRate = interestRate / 12;

        double presentValue = monthlyPayment * ((1 - Math.pow(1 + monthlyInterestRate, - months)) / monthlyInterestRate);

        }

    }
