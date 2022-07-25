
//Can We Override Static Method ?

//Ans : NO


package Week_1.Day4;

 class OverrideStatic {

    public static void print() {
        System.out.println("Parent Class");
    }

}
    class Override extends OverrideStatic
    {
        public static void print(){
            System.out.println("Child  Class");
        }

    }

     class Test{

         public static void main(String[] args) {
             OverrideStatic obj = new Override();

             obj.print();

         }

    }



    //Output:

//parent class

// static cannot be override
// because when thte static method is calledd it is called with its parent name