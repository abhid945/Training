package Week_1.Day15.CustomException;
/**
 * Write a program for::below cases to handle wrong operations done by customers in
 * deposit, and withdrawal operations.
 * Case 1)CREATE an InvalidAmountException if the user enters zero or -ve amount in deposit
 * and withdraw operations
 * Case 2)I hrow InsufficientBalanceException if the user enters the amount greater than the
 * balance in case of withdrawing operations
 */


import java.util.Scanner;

import static Week_1.Day15.CustomException.Transaction.sc;

public class Bank {
    int balance;

       public void validateDeposit() {
            try {
                System.out.println("Enter the Amount you want to Deposit");
                int depositamount = sc.nextInt();
                if (depositamount <= 0) {

                    throw new InvalidAmountException("Depositing Invalid Amount");
                } else {
                    balance =  balance +depositamount;
                    System.out.println(depositamount + "  Deposited in your bank.");
                    System.out.println(" Updated balance is  " + balance);
                }
            }
            catch (InvalidAmountException e){
                System.out.println(e);
            }
        }





        public static void main(String args[]) throws InsufficientBalanceException {
            Transaction transaction = new Transaction();
            transaction.SelectTransaction();

        }
    }



    /* Output
        Please enter 1 for Deposit and 2 for Withdrawal:
        1
       Enter the Amount you want to Deposit
       100000
       100000  Deposited in your bank.
       Updated balance is  100000

         */