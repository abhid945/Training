package Week_1.Day4;

public class StaticExample {

    static String Company_name = "Coditas";

    static void print(){
        System.out.println("This is static method");
        System.out.println("Company name is :" +Company_name);
    }

    static class Inner{
        int EmployeeID = 10230;
        void Employee_Details(){
            System.out.println("this is static class");
            System.out.println( "Company name ="+ Company_name +"Employeeid"+ EmployeeID);
        }
    }

    static{
        System.out.println("this is static block");
        System.out.println( "Employee record added");
    }

    public static void main(String[] args) {
        StaticExample.print();
        StaticExample.Inner  obj = new StaticExample.Inner();
        obj.Employee_Details();

    }

}
