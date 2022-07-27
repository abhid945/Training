package Week_1.Day6;

/**
 Create class WageEmployee extending Employee class with attributes as hrs (int)and rate(int) and
 method computeSalary() to calculate the salary.
 */
class Employee {
    String name;
    Employee(String em) {
        name = em;
    }

    void computeSalary() {
        System.out.println("Name of Employee is:"+ name);
    }
}


    class WageEmployee extends Employee {
        int hrs;
        int rate;

        WageEmployee(String em, int hrs, int rate) {
            super(em);
            this.hrs = hrs;
            this.rate = rate;
        }

        void computeSalary() {
            super.computeSalary();
            System.out.println("Wage of Employee is :" + hrs * rate);
        }
    }

    /*Create SalesPerson class extending WageEmployee with attributes as sales(int) and commission (int)*/
    class SalesPerson extends WageEmployee {
        int sales;
        int commision;

        SalesPerson(String em, int hrs, int rate, int sales, int commision) {
            super(em, hrs, rate);
            this.sales = sales;
            this.commision = commision;
        }

        void computeSalary() {
            super.computeSalary();
            System.out.println("Salary of sales person is :" + (sales + commision));
        }
    }


/*Create Manager class extending Employee class with attributes as fixed salary(int) and incentives(int)
and method computeSalary() to calculate the salary of Manager Print the salary and details of Manager*/
    class Manager extends Employee {
        int fixed_salary;
        int incentive;

        Manager(String em, int fixed_salary, int incentive) {
            super(em);
            this.fixed_salary = fixed_salary;
            this.incentive = incentive;
        }

        void computeSalary() {
            super.computeSalary();
            System.out.println("Salary of manager is " + (fixed_salary + incentive));
        }
    }

    public class TestClass {
        public static void main(String[] args) {
          Employee employee = new Manager("Abhishek",10000,20);
          WageEmployee wageEmployee = new SalesPerson("",10,200,20,2000);
          employee.computeSalary();
          wageEmployee.computeSalary();
        }
    }

