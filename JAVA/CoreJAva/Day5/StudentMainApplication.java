package Week_1.Day5;

//Encapsulation/POJO/Bean
class Student{
    private int rno;
    private String name;
    private String address;
    private float percentage;

    public int getRno() {
        return rno;
    }

    public void setRno(int rno) {
        this.rno = rno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress(String address) {
        return address;
    }


    public float getPercentage() {
        return percentage;
    }

    public void setPercentage(float percentage) {
        this.percentage = percentage;
    }
}

public class StudentMainApplication {
    public static void main(String[] args) {
        Student student = new Student();
        student.setRno(120);
        student.setName("Abhishek");
        student.getAddress("Mumbai");
        student.setPercentage(90.5f);
    }
}
