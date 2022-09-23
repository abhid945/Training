package com.bean;

import com.Dao.DaoImplementation;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainApplication {
    ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Bean.xml");
    DaoImplementation daoImplementation = (DaoImplementation) applicationContext.getBean("dao");
    Employee employee = new Employee();
    Address  address = new Address();

    void menu() throws IOException {
        int option;
        int resultset;
        int eid;

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        do {
            System.out.println("Please Select an option :" +
                    "\n1 to Insert " +
                    "\n2 to Delete " +
                    "\n3 to Display all");


            option = Integer.parseInt(bufferedReader.readLine());
            switch (option) {
                case 1:
                    System.out.println("Please enter aid flatno pincode and city");
                    address.setAid(Integer.parseInt(bufferedReader.readLine()));
                    address.setFlatNo(Integer.parseInt(bufferedReader.readLine()));
                    address.setPincode(Integer.parseInt(bufferedReader.readLine()));
                    address.setCity(bufferedReader.readLine());
                    System.out.println("Please enter eid , firstname, lastname,salary");
                    employee.setEmpid(Integer.parseInt(bufferedReader.readLine()));
                    employee.setFirstName(bufferedReader.readLine());
                    employee.setLastName(bufferedReader.readLine());
                    employee.setSalary(Integer.parseInt(bufferedReader.readLine()));
                    daoImplementation.insert(employee,address);
                    break;
                case 2:
                    System.out.println("Please enter the eid for which you want to delete data");
                    int id = Integer.parseInt(bufferedReader.readLine());
                    daoImplementation.delete(id);
                case 3:
                    daoImplementation.fetchall();

            }


        } while (option != 7);


    }

    public static void main(String[] args) throws IOException {
        MainApplication mainApplication = new MainApplication();
        mainApplication.menu();
    }
}

