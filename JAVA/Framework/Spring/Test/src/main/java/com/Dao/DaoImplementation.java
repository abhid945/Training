package com.Dao;

import com.bean.Address;
import com.bean.Employee;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DaoImplementation implements DaoInterface {

private JdbcTemplate jdbcTemplate;

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public int insert(Employee employee,Address address) {
        jdbcTemplate.update("insert into address values(?,?,?,?)",
                address.getAid(),address.getFlatNo(),address.getPincode(),address.getCity());
        jdbcTemplate.update("insert into employee values(?,?,?,?,?)",
                employee.getEmpid(),employee.getFirstName(),employee.getLastName(),employee.getSalary(),address.getAid());
         return 1;
    }

    public void delete(int id){
        jdbcTemplate.update("delete from employee where eid=? ",id);
        jdbcTemplate.update("delete from address where aid=?",id);
    }

    public void fetchall(){
            final List<Employee> employeeList =   jdbcTemplate.query("Select * from address inner join employee on employee.aid= address.aid", new RowMapper<Employee>() {

            @Override
            public Employee mapRow(ResultSet resultSet, int i) throws SQLException {
                List<Address> addresslist= new ArrayList();
                List<Employee> list = new ArrayList();
                Address address = new Address();
                Employee employee = new Employee();
                address.setAid(resultSet.getInt(1));
                address.setFlatNo(resultSet.getInt(2));
                address.setPincode(resultSet.getInt(3));
                address.setCity(resultSet.getString(4));
                addresslist.add(address);
                employee.setEmpid(resultSet.getInt(5));
                employee.setFirstName(resultSet.getString(6));
                employee.setLastName(resultSet.getString(7));
                employee.setSalary(resultSet.getInt(8));
                employee.setAddress(addresslist);
                list.add(employee);
                return employee;
            }
        });
        System.out.println(employeeList);
    }




    @Override
    public int displayall(int eid) {
        return 0;
    }
}
