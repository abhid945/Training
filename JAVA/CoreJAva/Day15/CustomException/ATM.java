package Week_1.Day15.CustomException;

import static Week_1.Day15.CustomException.Transaction.sc;

public class ATM extends Bank {
    void validateWithdraw(){
       try {
           System.out.println("enter the amount you want to withdraw");
           int withdrawamount = sc.nextInt();
           if (withdrawamount <= 0) {

               throw new InsufficientBalanceException("Please enter value greater than 0");
           } else if (withdrawamount > balance) {
               throw new InsufficientBalanceException("Insufficient Balance in account");
           } else {
               balance = balance-withdrawamount;
               System.out.println(withdrawamount + " is withdrawn from your account");
               System.out.println("Updated balance is: "+balance);
           }
       }
       catch (InsufficientBalanceException e){
           System.out.println(e);
       }

    }
}
