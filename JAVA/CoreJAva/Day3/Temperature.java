package Week_1.Day3;

public class Temperature {
    int variable = 2;

    public void temperature() {
        switch (variable) {
            //Case statements
            case 1:
                System.out.println("Temperature is : High");
                break;
            case 2:
                System.out.println("Temperature is : Medium");
                break;
            case 3:
                System.out.println("Temperature is : Low");
                break;
            //Default case statement
            default:
                System.out.println("Temperature is abnormal");
        }

    }

    public static void main(String[] args) {

        Temperature temperature = new Temperature();
        temperature.temperature();

    }
}


//   Output:


//   Temperature is medium
