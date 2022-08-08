package Week_1.Day14;

/**
 * Write a code for "Class CastException'" and handle it using Exception handling
 * Mechanism
 * >try,catch,finally
 * @Author Abhishek Dubey
 */




class Animal {
}

class Dog extends Animal {
}

class Lion extends Animal {

}
public class ClassCast {
    public static void main(String[] args) {
        try {
            Animal animalOne = new Dog();
            Dog bruno = (Dog) animalOne;

            Animal animalTwo = new Lion();
            Dog tommy = (Dog) animalTwo; //We are trying to Down cast Lion to Dog
        }
        catch (ClassCastException e) {
            System.err.println("ClassCastException caught!" + e.getMessage());
         //   e.printStackTrace();
        }
        finally {
            System.out.println("This is the end of the program ");
        }

    }
}

/*

 */