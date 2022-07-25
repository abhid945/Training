// Why main method is declared as  static ?

// The static main() method makes it very clear for the JVM to call it for launching the Java Application.
// Anything which is declared in class in Java comes under reference type and requires objects to be created
// before using them but the static method and static data are loaded into separate memory inside JVM called
// context which is created when a class is loaded.
// If the main method is static then it will be loaded in the JVM context and are available for execution.


package Week_1.Day4;

public class StaticMain {
    public static void main(String[] args) {

    }
}
