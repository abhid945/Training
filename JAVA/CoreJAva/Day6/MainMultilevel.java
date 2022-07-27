package Week_1.Day6;

class RajKapoor{
    int pan_id = 103802;
    public void display(){
        System.out.println("Pan ID of Grandparent Raj is: "+ pan_id);
    }
}


class RandheerKapoor extends  RajKapoor {
    int pan_id = 98472;
    String name = "Randheer Kapoor";

    public void display() {
        super.display();
        System.out.println("Pan ID of Parent Randheer is: " + pan_id);
        System.out.println("Name of Parent:"+ name);

    }
}

class KareenaKapoor extends RandheerKapoor {
    int pan_id = 124245;
    int aadhaar_id = 12345;
    String name = "Kareena Kapoor";

    public void display() {
        super.pan_id = 8378;  //changing the pan id of Randheer Kapoor
        super.display();
        System.out.println("Pan ID of Child Kareena is: " + pan_id);
        System.out.println("Name :" + name);
        System.out.println("Adhaar id: " + aadhaar_id);

    }

}

public class MainMultilevel {
    public static void main(String[] args) {
            KareenaKapoor kareenaKapoor = new KareenaKapoor();
            kareenaKapoor.display();
    }
}

