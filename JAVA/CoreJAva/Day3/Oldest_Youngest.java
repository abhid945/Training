package Week_1.Day3;
import java.util.Scanner;
public class Oldest_Youngest {
    int Age1, Age2, Age3;

        public void Accepting_Age() {



            Scanner s = new Scanner(System.in);
            System.out.print("Enter the age of first person:");
            Age1 = s.nextInt();
            System.out.print("Enter the second number:");
            Age2 = s.nextInt();
            System.out.print("Enter the third number:");
            Age3 = s.nextInt();

        }

        public void Printing_Oldest(){
            if(Age1 > Age2 && Age1 > Age3)
            {
                System.out.println("Age of oldest person:"+Age1);
            }
            else if(Age2 > Age3)
            {
                System.out.println("Age of oldest person:"+Age2);
            }
            else
            {
                System.out.println("Age of oldest person:"+Age3);
            }

        }

        public void Printing_Youngest(){
        if(Age1 < Age2 && Age1 < Age3)
        {
            System.out.println("Age of youngest person:"+Age1);
        }
        else if(Age2 < Age3)
        {
            System.out.println("Age of youngest person:"+Age2);
        }
        else
        {
            System.out.println("Age of youngest person:"+Age3);
        }

    }

       public static void main(String[] args) {
        Oldest_Youngest oldestYoungest = new Oldest_Youngest();
        oldestYoungest.Accepting_Age();
        oldestYoungest.Printing_Oldest();
        oldestYoungest.Printing_Youngest();
    }
    }



//Output


//  Enter the age of first person:10
//  Enter the second number:20
//  Enter the third number:30
//  Age of oldest person:30
//  Age of youngest person:10