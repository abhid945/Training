package Week_1.Day8;
/**
 * Practically prove, After changing the return type, overriding happens or not?
 @Author Abhishek Dubey
 */
class GrandFather
{
    static Object getObject(){
        return new GrandFather();
    }
    public void show(){}
}
class Parent extends  GrandFather
{
    static Parent getObject()
    {
        return new Parent();
    }
    public void show()
    {
        System.out.println("Parent Class Object");
    }

}
class Child extends GrandFather
{
    static Child getObject()
    {
        return new Child();
    }
    public void show()
    {
        System.out.println("Child Class Object");
    }
}
public class OverrdingDriver {
    public static void main(String[] args) {
        GrandFather grandFather=null;
        grandFather = Parent.getObject();
        grandFather.show();
        grandFather = Child.getObject();
        grandFather.show();
    }
}



/* Output
Parent Class Object
Child Class Object
 */