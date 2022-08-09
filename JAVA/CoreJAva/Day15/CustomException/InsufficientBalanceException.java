package Week_1.Day15.CustomException;

public class InsufficientBalanceException  extends  Exception{

    InsufficientBalanceException(String message){
        System.out.println("Insufficient Balance-------->" + message);
    }
}