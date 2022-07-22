package Week_1.Day3;

public class Pattern {

    public void print_pattern(){
        int row, column, no_of_rows=5;
        for(row=0; row<no_of_rows; row++)   //incrementing rows based on number of rows
        {
            for(column=0; column<=row;  column++)        //incrementing column everytime we increase row
            {
                System.out.print("* ");               //printing * everytime we increase row and column
            }
            System.out.println();
        }
    }

        public static void main(String args[])
        {
         Pattern pattern = new Pattern();
         pattern.print_pattern();
        }
    }



    //Output

//   *
//   * *
//   * * *
//   * * * *
//   * * * * *

