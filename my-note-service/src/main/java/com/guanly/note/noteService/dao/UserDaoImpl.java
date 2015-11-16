package com.guanly.note.noteService.dao;

import com.guanly.note.dao.DAOImpl;
import com.guanly.note.noteService.domain.User;

/**
 * Created by guanly on 2015/8/2.
 */
public class UserDaoImpl extends DAOImpl {

    public User getUser() {
        String statement = "com.guanly.mynote.mapping.userMapper.getUser";
        return getDomain(statement, 1);
    }
}
