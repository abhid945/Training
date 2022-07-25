package Week_1.Day4;

public class Output {

    private static int x = 10;

    static {
        x++;
        System.out.println("frist static x = "+ x);
    }
        static{
        ++x;
            System.out.println("second static x = "+ x);
    }
        {
            x--;//this block is executed thrice
            System.out.println("Decreement of x=" + x);
        }

    public static void main(String[] args) {


        Output obj1 = new Output();
        Output obj2 = new Output();
        Output obj3 = new Output();
        Output obj4 = new Output();



        System.out.println(x);
    }
    }


    //the output of the code is 9
// here the static block is executed first and then the object is called
