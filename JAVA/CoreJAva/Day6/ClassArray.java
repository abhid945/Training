
/**
 Write a TestEmployee class to print the details of all types of employees (use array[] of Employee class)
 */

package Week_1.Day6;

class Employe
{
    //static because for all employee Company name is same
    final static String CompanyName = "Coditas";
    String EmpName,Position,salary;
    Address a;
    public String getEmpName() {
        return EmpName;
    }

    public void setEmpName(String empName) {
        EmpName = empName;
    }

    public String getPosition() {
        return Position;
    }

    public void setPosition(String position) {
        Position = position;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public Address getA() {
        return a;
    }

    public void setA(Address a) {
        this.a = a;
    }

    @Override
    public String toString() {
        return "Employe{" +
                "EmpName='" + EmpName + '\'' +
                ", Position='" + Position + '\'' +
                ", salary='" + salary + '\'' +
                ", a=" + a +
                '}';
    }

    //Address Nested class which hold all the address attribute like city  area house no.
    class Address
    {

        String city , area, houseNo;
        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getArea() {
            return area;
        }

        public void setArea(String area) {
            this.area = area;
        }

        public String getHouseNo() {
            return houseNo;
        }

        public void setHouseNo(String houseNo) {
            this.houseNo = houseNo;
        }

        @Override
        public String toString() {
            return "Address{" +
                    "city='" + city + '\'' +
                    ", area='" + area + '\'' +
                    ", houseNo='" + houseNo + '\'' +
                    '}';
        }


    }

}
public class ClassArray {
    public void displayEmployeeDetail(Employe[] e)
    {
        for (int i=0;i<e.length;i++)
        {
            System.out.println("******************Employee "+(i+1)+" Details*******************");
            System.out.println(e[i]);
        }
    }
    public static void main(String[] args) {
        Employe employe[]=new Employe[2];
        //Employee One
        Employe employe1 = new Employe();
        Employe.Address address = employe1.new Address();
        address.setArea("Navi Mumbai");
        address.setCity("Mumbai");
        address.setHouseNo("101");
        employe1.setA(address);
        employe1.setEmpName("Abhishek Dubey");
        employe1.setSalary("35000");
        employe1.setPosition("Associate Software Developer");
        //Employee Two
        Employe employe2 = new Employe();
        Employe.Address address2 = employe1.new Address();
        address2.setArea("");
        address2.setCity("Pune");
        address2.setHouseNo("102");
        employe2.setA(address);
        employe2.setEmpName("Prathmesh Londe");
        employe2.setSalary("35000");
        employe2.setPosition("Associate Software Developer");
        //Employe three
        Employe employe3 = new Employe();
        Employe.Address address3 = employe1.new Address();
        address2.setArea("");
        address2.setCity("Pune");
        address2.setHouseNo("102");
        employe2.setA(address);
        employe2.setEmpName("Prathmesh Londe");
        employe2.setSalary("35000");
        employe2.setPosition("Associate Software Developer");
        employe[0]=employe1;
        employe[1]=employe2;
        new ClassArray().displayEmployeeDetail(employe);
    }
}







