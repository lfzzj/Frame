package com.anshida.greendao;

import android.content.Context;

import com.anshida.greendao.db.DBManager;

import java.util.ArrayList;
import java.util.List;

/**
 * Create by LF
 * DATA 2019/6/26
 * Describe:
 */
public class GreenDao {

    private DBManager greenDaoHelper;


    public static List<User> getData() {
        List<User> users = new ArrayList<User>();
        users.clear();
        for (int i = 0; i < 10; i++) {
            User user = new User();
            user.setId(i);
            user.setName("JackWaiting" + i);
            user.setAge(i);
            users.add(user);
        }

        return users;
    }

    public void getGreenDaoHelper(Context context) {
        greenDaoHelper = new DBManager(context);

        greenDaoHelper.deleteAll();

        greenDaoHelper.insertUser(getData().get(0));

    }

}
