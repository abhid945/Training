package Week_1.Day3;

public class Output_checking {

    int number1 = 3;

    public void Code(){

      if (number1>=0) {  //first if  condition according to our input the condition is true

          if (number1 == 0)
              System.out.println("first");    //according to our input this condition is false
          else
              System.out.println("Second");           //second is printed because it satisfies the condition

      }
              System.out.println("third");           //third will be printed no matter what the condition is because its ouitside the control statement

  }



    public static void main(String[] args) {
      Output_checking outputChecking = new Output_checking();
      outputChecking.Code();
    }
}




//The output of the code is :

//   Second
//   third


