package ru.gb.oseminar.view;

import java.util.logging.Logger;

import ru.gb.oseminar.data.Teacher;

public class TeacherView implements UserView<Teacher>{

    Logger logger = Logger.getLogger(TeacherView.class.getName());

    @Override
    public void sendOnConsole(List<Teacher> teachers) {
        for(Teacher teacher: teachers){
            logger.info(teacher.toString());
        }
    }

   

}
