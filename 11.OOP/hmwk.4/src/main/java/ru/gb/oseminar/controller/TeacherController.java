package ru.gb.oseminar.controller;

import java.time.LocalDate;
import java.util.List;

import ru.gb.oseminar.data.Teacher;
import ru.gb.oseminar.service.TeacherService;

public class TeacherController implements UserController<Teacher> {
   TeacherService  teacherService;

   @Override
   public void create(String firstName, String secondName, String patronymic, LocalDate dateOfBirth) {
     teacherService = new TeacherService();
     teacherService.create(firstName, secondName, patronymic, dateOfBirth);
   }
   
   public Teacher getTeacher(String firstName, String secondName) {
      List<Teacher> teachers = teacherService.getAll();
      for(Teacher teacher : teachers) {
         if(teacher.getFirstName().equals(firstName) && teacher.getSecondName().equals(secondName)) {
            return teacher;
         }
      }
      return null;
   }

   public void removeTeacher(String firstName, String secondName) {
      List<Teacher> teachers = teacherService.getAll();
      for(Teacher teacher : teachers) {
         if(teacher.getFirstName().equals(firstName) && teacher.getSecondName().equals(secondName)) {
            teachers.remove(teacher);
         }
      }
   }
}
