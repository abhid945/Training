package Week_1.Day3;
import java.util.Calendar;
import java.util.Formatter;

public class Today_Date {
        public void PrintDate(int currentDate)
        {
            Calendar calendar = Calendar.getInstance();
            Formatter fmt = new Formatter();
            fmt.format("%tB",calendar);
            String today =fmt.toString();
            for (int datee=1; datee<=currentDate; datee++)
            {
                if(datee!=currentDate)
                    System.out.println(today+" - "+datee);
                else
                    System.out.println("today is "+currentDate+"th"+" "+ today);
            }
        }

        public static void main(String[] args) {
         Today_Date today_date= new Today_Date();
            today_date.PrintDate(22);
        }
    }
//Output
//  July - 1
//  July - 2
//  July - 3
//  July - 4
//  July - 5
//  July - 6
//  July - 7
//  July - 8
//  July - 9
//  July - 10
//  July - 11
//  July - 12
//  July - 13
//  July - 14
//  July - 15
//  July - 16
//  July - 17
//  July - 18
//  July - 19
//  July - 20
//  July - 21
//  today is 22th July