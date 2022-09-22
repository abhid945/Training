package com.Dao;

import com.bean.Facebook;
//import com.bean.FacebookApplication;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DaoImplementation implements DaoInterface {

    private JdbcTemplate jdbcTemplate;

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }




    @Override
    public int insertUSer(Facebook facebook) {
        return jdbcTemplate.update("insert into facebook values(?,?,?,?,?)",
                facebook.getUsername(),facebook.getFirstName(),facebook.getLastName(),facebook.getAge(),facebook.getEmail());
    }

    public void UpdateMenu() throws IOException {
        int choice;
        String username;
        boolean flag=true;
        do{
            System.out.println("Please Select an option :" +
                    "\n1 to Update email" +
                    "\n2 to Update firstname " +
                    "\n3 to Update lastname" +
                    "\n4 to Update age"+
                    "\n5 to exit to main menu ");
            choice = Integer.parseInt(br.readLine());
            switch (choice){
                case 1:
                    System.out.println("Enter new email id");
                    String email= br.readLine();
                    System.out.println("Enter username for which you want to update data");
                    username = br.readLine();
                    if(jdbcTemplate.update("update facebook set email = ? where username=? ",email,username) > 0){
                        System.out.println("Email updated");
                    }else {
                        System.out.println("Failed to update Email!!! try again");
                    }
                 break;
                case 2:
                    System.out.println("Enter new firstname");
                    String firstName= br.readLine();
                    System.out.println("Enter username for which you want to update data");
                    username = br.readLine();
                    if(jdbcTemplate.update("update facebook set firstname = ? where username=? ",firstName,username) > 0){
                        System.out.println("FirstName  updated");
                    }else {
                        System.out.println("Failed to update FirstName!! try again");
                    }
                    break;
                case 3:
                    System.out.println("Enter new lastname");
                    String lastName= br.readLine();
                    System.out.println("Enter username for which you want to update data");
                    username = br.readLine();
                    if(jdbcTemplate.update("update facebook set lastname = ? where username=? ",lastName,username) > 0){
                        System.out.println("LastName  updated");
                    }else {
                        System.out.println("Failed to update LastName!!! try again");
                    }
                    break;
                case 4:
                    System.out.println("Enter new age");
                    int age= Integer.parseInt(br.readLine());
                    System.out.println("Enter username for which you want to update data");
                    username = br.readLine();
                    if(jdbcTemplate.update("update facebook set age = ? where username=? ",age,username) > 0){
                        System.out.println("Age updated");
                    }else {
                        System.out.println("Failed to update Age!!! try again");
                    }
                    break;
                case 5:
//                    flag =false;
//                    new FacebookApplication().menu();
//                default:
//                    System.out.println("Please enter Correct option");
            }

        }
        while(flag);
    }



    @Override
    public int DeleteUser(String username) {

        return jdbcTemplate.update("Delete from facebook where username = ?",username);
    }

    @Override
    public List<Facebook> fetchAllUser() {
        String sql = "Select * from Facebook";

        List<Facebook> facebook = jdbcTemplate.query( sql,new RowMapper<Facebook>() {
            @Override
            public Facebook mapRow(ResultSet resultSet, int i) throws SQLException {
                Facebook facebook = new Facebook();
                facebook.setUsername(resultSet.getString(1));
                facebook.setLastName(resultSet.getString(2));
                facebook.setFirstName(resultSet.getString(3));
                facebook.setAge(resultSet.getInt(4));
                facebook.setEmail(resultSet.getNString(5));
                return facebook;
            }
        });
        if(!facebook.isEmpty()){
            System.out.println("Displaying Records");
        }
        else {
            System.out.println("No Record found");
        }
        return facebook;
    }

    @Override
    public List<Facebook> fetchbyUsername(String username) {
        String sql ="Select * from facebook where username = ?";
        final List<Facebook> facebookList = jdbcTemplate.query(sql, new ResultSetExtractor<List<Facebook>>() {
            List<Facebook> list =new ArrayList();
            @Override
            public List<Facebook> extractData(ResultSet resultSet) throws SQLException, DataAccessException {
                resultSet.next();
                Facebook facebook =new Facebook();
                facebook.setUsername(resultSet.getString(1));
                facebook.setLastName(resultSet.getString(2));
                facebook.setFirstName(resultSet.getString(3));
                facebook.setAge(resultSet.getInt(4));
                facebook.setEmail(resultSet.getString(5));
                list.add(facebook);
                return list;
            }
        },username);
        if(!facebookList.isEmpty()){
            System.out.println("Displaying Records");
        }
        else {
            System.out.println("No Record found");
        }
        return facebookList;
    }
}
