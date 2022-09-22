package com.Dao;

import com.bean.Facebook;

import java.io.IOException;
import java.util.List;

public interface DaoInterface {


    int insertUSer(Facebook facebook);

    int DeleteUser(String username);
    List<Facebook> fetchAllUser();
    List<Facebook> fetchbyUsername(String username);

}
