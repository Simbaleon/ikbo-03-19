package Prac9;

import java.util.ArrayList;

public class LabClass {
    private final ArrayList<Student> listOfStudents;
    private Student student = null;

    LabClass() {
        this.listOfStudents = new ArrayList<>();
    }

    public void add(Student student) {
        listOfStudents.add(student);
        listOfStudents.sort(Student::compareTo);
    }

    Student find(String name) throws StudentNotFoundExeption {
        student = null;
        listOfStudents.forEach(student -> {
            if (student.getName().equals(name))
                this.student = student;
        });
        if (student == null) {
            throw new StudentNotFoundExeption("Студент '" + name + "' не найден!");
        }
        return student;
    }

    Student remove() {
        return listOfStudents.remove(0);
    }

    boolean isEmpty() {
        return listOfStudents.isEmpty();
    }
}