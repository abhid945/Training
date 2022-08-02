package Week_1.Day10;

import javafx.scene.Parent;

class Parentclass{

}

class Childclass extends Parentclass{
    static void display(Parentclass parentclass) {
        if (parentclass instanceof Childclass){
            Childclass childclass = (Childclass) parentclass;
            System.out.println("Downcasting is performed");}
    }
}


public class CastingExample {
    public static void main(String[] args) {
      Parentclass parentclass = new Childclass();
      Childclass.display(parentclass);
    }
}
