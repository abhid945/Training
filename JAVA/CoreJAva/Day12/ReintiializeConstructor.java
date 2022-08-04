package Week_1.Day12;

/**
 * Using Constructor try to Reinitialize values of class
 * Employee(emp id,emp_name,emp_address,emp_sal)
 */
class Reinitialize{
    int emp_id;

    @Override
    public String toString() {
        return "Reinitialize{" +
                "emp_id=" + emp_id +
                ", emp_name='" + emp_name + '\'' +
                ", emp_address='" + emp_address + '\'' +
                ", emp_sal=" + emp_sal +
                '}';
    }

    String emp_name;
    String emp_address;
    float emp_sal;
    public Reinitialize(int emp_id, String emp_name, String emp_address, float emp_sal) {
        this.emp_id = emp_id;
        this.emp_name = emp_name;
        this.emp_address = emp_address;
        this.emp_sal = emp_sal;
    }


}


public class ReintiializeConstructor {
    public static void main(String[] args) {
Reinitialize reinitialize = new Reinitialize(10,"Abhishek Dubey","Mumbai",100000);
        System.out.println(reinitialize);
    }
}

/*
Output:
Reinitialize{emp_id=10, emp_name='Abhishek Dubey', emp_address='Mumbai', emp_sal=100000.0}

 */