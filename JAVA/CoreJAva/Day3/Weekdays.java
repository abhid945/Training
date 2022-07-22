package Week_1.Day3;

public class Weekdays {
    String WeekArray[]={"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
    public void Skip_Thursday()            //Skipping Thursday's
    {
        for(String day : WeekArray)
        {
            if(day.equals("Thursday"))
                continue;
            System.out.println(day);
        }
    }



    public void Skip_Today(){
        String today = "Friday";
        for(String day : WeekArray)
        {
            if(day.equals(today))
                continue;
            System.out.println(day);


        }


    }              //Skipping Todays  day

    public static void main(String[] args) {
        Weekdays weekdays = new Weekdays();
        weekdays.Skip_Thursday();
        System.out.println("****************************");
        weekdays.Skip_Today();
    }



}


//OUTPUT

//   Monday
//   Tuesday
//   Wednesday
//   Friday
//   Saturday
//   Sunday
//   ****************************
//   Monday
//   Tuesday
//   Wednesday
//   Thursday
//   Saturday
//   Sunday
