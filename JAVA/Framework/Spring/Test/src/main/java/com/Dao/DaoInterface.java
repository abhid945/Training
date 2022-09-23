package com.Dao;

import com.bean.Address;
import com.bean.Employee;

public interface DaoInterface {

    public int insert(Employee employee,Address address);
//    public int insertEmployee(Employee employee,Address address);

    public int displayall(int eid);

}
