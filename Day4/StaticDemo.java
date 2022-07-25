package Week_1.Day4;
//driver class
   public class StaticDemo {
    String name = "Batch2";
    static int aadhar_card = 123456;


    //non static method
   public void accept_data(){
    System.out.println("The person name is:" + name + "The adhaar number is:" + aadhar_card);
   }


  //static method
   static public void show_data(){  //never use nonstatic variable in static method
    System.out.println("The person name is: null, The adhaar number is:" + aadhar_card);
    aadhar_card++;
   }
   //never use nonstatic variable in static method
   // static is called as initializer block or it is called as Load initializer block
   //in static block we cannot use instance variable
    // we can only use local and static variable

    static {
    System.out.println("This is a static block");
    }
    public static void main(String[] args) {
       StaticDemo staticDemo = new StaticDemo();
       staticDemo.accept_data();
       staticDemo.show_data();
    }
}
