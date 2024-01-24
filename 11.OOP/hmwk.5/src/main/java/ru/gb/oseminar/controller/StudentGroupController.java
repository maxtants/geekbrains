package main.java.ru.gb.oseminar.controller;

import java.util.List;

import model.StudentGroup;
import ru.gb.oseminar.data.Student;
import ru.gb.oseminar.data.Teacher;
import ru.gb.oseminar.data.StudentGroup;

public class StudentGroupController {
   public StudentGroup createStudentGroup(Teacher teacher, List<Student> students) {
      StudentGroup studentGroup = new StudentGroup(teacher, students);
      return studentGroup;
   }
}
