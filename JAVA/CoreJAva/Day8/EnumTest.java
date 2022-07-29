package Week_1.Day8;

/**
 Write a program using enum which will print following output
 Add enum RED('STOP"),GREEN("GO"),YELLOw"DRIVE VERY SLOW")
 Try to print values:
 RED MEANS STOP,GREEN MEANS GO,YELLOW MEANS DRIVE VERY Slow
 @Author Abhishek Dubey
 */
enum Traffic
{
    RED("STOP"),
    GREEN("GO"),
    YELLOW("DRIVE SLOW");


    private String description;

    Traffic(String Action) {
        this.description = Action;
    }

    public String doAction() {
        return description;
    }
}

public class EnumTest {
    static void show()
    {
        for(Traffic colour : Traffic.values())
        {
            System.out.println(colour.name()+" Means "+colour.doAction() );
        }
    }
    public static void main(String[] args) {
        EnumTest.show();
    }
}


/* Output:

RED Means STOP
GREEN Means GO
YELLOW Means DRIVE SLOW
 */