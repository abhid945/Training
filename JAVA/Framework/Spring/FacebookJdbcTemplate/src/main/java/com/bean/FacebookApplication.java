//package com.bean;
//
//import com.Dao.DaoImplementation;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//
//public class FacebookApplication {
//
//
//    ApplicationContext applicationContext = new ClassPathXmlApplicationContext("FacebookBean.xml");
//    DaoImplementation daoImplementation = (DaoImplementation) applicationContext.getBean("facebookDao");
//    public  void menu() throws IOException {
//
//         int option;
//         int resultset;
//         String username;
//
//         BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//
//         do {
//             System.out.println("Please Select an option :" +
//                     "\n1 to Insert book data" +
//                     "\n2 to Update record " +
//                     "\n3 to Delete Record" +
//                     "\n4 to  Display all record using Row Mapper"+
//                     "\n5 to  Display record by username");
//             option = Integer.parseInt(bufferedReader.readLine());
//             switch (option) {
//                 case 1:
//                     Facebook facebook = new Facebook();
//                     System.out.println("Enter username, last name,first name,age,email");
//
//                     facebook.setUsername(bufferedReader.readLine());
//                     facebook.setLastName(bufferedReader.readLine());
//                     facebook.setFirstName(bufferedReader.readLine());
//                     facebook.setAge(Integer.parseInt(bufferedReader.readLine()));
//                     facebook.setEmail(bufferedReader.readLine());
//                     resultset = daoImplementation.insertUSer(facebook);
//                     if (resultset >0)
//                         System.out.println("Record Inserted Sucessfully");
//                     else
//                         System.out.println("Insertion failed");
//                     break;
//                 case 2:
//                      daoImplementation.UpdateMenu();
//                 case 3:
//                     System.out.println("Enter the username that you want to delete");
//                     username = bufferedReader.readLine();
//                     resultset = daoImplementation.DeleteUser(username);
//                     if (resultset >0)
//                         System.out.println("Record Deleted Sucessfully");
//                     else
//                         System.out.println("Deletion  failed");
//                     break;
//                 case 4:
//                     System.out.println("**************All User Details***************");
//                     System.out.println(daoImplementation.fetchAllUser());
//                     break;
//                 case 5:
//                     System.out.println("Enter the book name to fetch its details");
//                     username = bufferedReader.readLine();
//                     System.out.println(daoImplementation.fetchbyUsername(username));
//                     break;
//             }
//
//         }
//         while (option != 6);
//     }
//
//
//
//
//    public static void main(String[] args) throws IOException {
//         FacebookApplication facebookApplication = new FacebookApplication();
//         facebookApplication.menu();
//
//    }
//
//
//
//}