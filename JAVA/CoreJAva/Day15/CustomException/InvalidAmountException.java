package Week_1.Day15.CustomException;

public class InvalidAmountException extends  Exception{

    InvalidAmountException(String msg){
        System.out.println("Invalid Amount------->" + msg);
    }
}
