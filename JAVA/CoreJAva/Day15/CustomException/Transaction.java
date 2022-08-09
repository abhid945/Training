package Week_1.Day15.CustomException;

import java.util.Scanner;

public class Transaction  extends  Bank {
    static Scanner sc = new Scanner(System.in);

    void SelectTransaction() {
        System.out.println("Please enter 1 for Deposit and 2 for Withdrawal:");
        int number1 = sc.nextInt();
        Bank bank = new Bank();
        ATM atm = new ATM();
        switch (number1) {
            case 1:
                bank.validateDeposit();
                break;
            case 2:
                atm.validateWithdraw();
                break;
        }

    }
}
