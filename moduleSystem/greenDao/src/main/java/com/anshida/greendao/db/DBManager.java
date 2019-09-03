package com.anshida.greendao.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.anshida.greendao.User;

import java.util.ArrayList;
import java.util.List;

/**
 * Create by LF
 * DATA 2019/6/26
 * Describe:
 */
public class DBManager {
    UserDao userDao;

    public DBManager(Context context) {
        DaoMaster.DevOpenHelper helper = new DaoMaster.DevOpenHelper(context, "JackWaiting-db", null);
        SQLiteDatabase db = helper.getWritableDatabase();
        DaoMaster daoMaster = new DaoMaster(db);
        DaoSession daoSession = daoMaster.newSession();
        userDao = daoSession.getUserDao();
    }

    /**
     * 查
     * @param type
     * @return
     */
    public ArrayList<User> getDatasByType(int type) {
        return (ArrayList<User>) userDao.queryBuilder().where(UserDao.Properties.Name.eq(type)).list();
    }

    /**
     * 查（所有）
     * @return
     */
    public List<User> getUserAll() {
        return userDao.loadAll();
    }

    /**
     * 增
     * @param user
     */
    public void insertUser(User user) {
        userDao.insert(user);
    }

    /**
     * 删
     * @param user
     */
    public void deleteUser(User user) {
        userDao.delete(user);
    }

    /**
     * 删（所有）
     */
    public void deleteAll() {
        userDao.deleteAll();
    }

    /**
     * 改
     * @param user
     */
    public void updateUser(User user) {
        userDao.update(user);
    }
}
