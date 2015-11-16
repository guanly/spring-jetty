package com.guanly.note.main;

import com.guanly.note.noteService.NoteServiceImpl;
import com.guanly.note.spring.MyBeanUtils;

/**
 * Created by guanly on 2015/8/2.
 */
public class Main {
    public static void main(String[] args) {
        MyBeanUtils.initBeanFactory("spring/spring.xml", "spring/spring-dao.xml", "spring/spring-service.xml");
        NoteServiceImpl noteService = (NoteServiceImpl) MyBeanUtils.getBean("noteService");
        noteService.printLog();
    }
}
