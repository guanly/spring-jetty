package com.guanly.note.noteService;

import com.guanly.note.noteService.dao.UserDaoImpl;
import com.guanly.note.noteService.domain.User;
import org.apache.log4j.Logger;

/**
 * Created by guanly on 2015/8/2.
 */
public class NoteServiceImpl {
    Logger log = Logger.getLogger(NoteServiceImpl.class);

    private UserDaoImpl userDao;

    public void printLog() {
        User user = getUser();
        System.out.println(user);
    }

    public User getUser() {
        return userDao.getUser();
    }

    public void setUserDao(UserDaoImpl userDao) {
        this.userDao = userDao;
    }

}
