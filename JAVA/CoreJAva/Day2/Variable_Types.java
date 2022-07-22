package Week_1.Day2;

public class Variable_Types {
    //static variable branch because its same for all the students in one branch
    static String Branch = "Computer";
    String name = "Abhishek";


    public static void main(String[] args) {
        int marks = 100;

     Variable_Types variableTypes = new Variable_Types();
        System.out.println("Student Branch:-" + variableTypes.Branch);
        System.out.println("Student Name:-" + variableTypes.name);
        System.out.println("Student Marks:-" + marks);


    }
}
