package com.dm;

import java.security.Principal;
import java.util.Scanner;
public class FinancialCalculators {

    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        System.out.println("What is the principal: ");
        double principalRes = myScanner.nextFloat(); // Principal response


        System.out.println("What is the interest rate: ");
        double interestRes = myScanner.nextFloat(); // Interest rate response


        System.out.println("What is the length of the loan in years: "); // loan length response in years
        double loanLengthRes = myScanner.nextFloat();

        // Mortgage calculation
        double monthlyPayment = (principalRes * interestRes / loanLengthRes);

        // Interest rate calculation
        double totalInterestPaid = (monthlyPayment * loanLengthRes) - principalRes;

        // Total payment calculation
        double totalPayment = monthlyPayment + totalInterestPaid;

        //Output for variables above
        System.out.printf("Your monthly payment is $%.2f" + monthlyPayment);
        System.out.printf("Your total interest is $%.2f" + totalPayment);
        System.out.printf("In total you pay $%.2f" + totalPayment );




        // look up how to Calculate Mortgage payments

//        Principal = $55,000
//        Interest = 7.625%
//        Loan length = 10 years

//        double Principal = principalRes;
//        double Interest = interestRes;
//        double loanLength = loanLengthRes;


//        double sum1 = principalRes + interestRes;
//        double sum2 =

//        float principle = principalRes;
//        float interest = interestRes;
//        float length = lengthRes;


//        int principal =
//        int interestRate =
//        int loanLength =

    }
}
