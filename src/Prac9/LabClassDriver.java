package Prac9;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

import static java.lang.System.err;
import static java.lang.System.out;

public class LabClassDriver {

    LabClass labClass;
    String file = "C:\\Java\\Lab1\\src\\Prac9\\students.txt";

    LabClassDriver(LabClass labClass) {
        this.labClass = labClass;
    }

    public void createLabClass() {
        Scanner in = new Scanner(System.in);
        out.print("Введите сколько студентов добавить: ");
        int n = in.nextInt();
        for (int i = 0; i < n; i++)
            addStudent();
    }

    public void addStudent(){
        Scanner in = new Scanner(System.in);
        out.print("Введите имя и оценку студента, чтобы добавить его: ");
        String name;
        int grade;
        name = (in.next()).toLowerCase();
        grade = in.nextInt();
        labClass.add(new Student(name, grade));
    }

    public void saveLabCLass() {

        try {
            FileWriter writer = new FileWriter(file);

            while (!labClass.isEmpty()) {
                writer.write(labClass.remove().toString() + "\n");
            }
            writer.flush();
        }
        catch (Exception e) {
            err.println("Такого файла нет!");
        }

    }

    public void fillLabClass() {
        try {
            FileReader reader = new FileReader(file);
            Scanner in = new Scanner(reader);
            while (in.hasNextLine()) {
                String string = in.nextLine();
                int firstIndex = string.indexOf("name='") + 6;
                int lastIndex = string.lastIndexOf('\'');
                String name = string.substring(firstIndex, lastIndex);

                firstIndex = string.indexOf("grade=") + 6;
                lastIndex = string.lastIndexOf('}');
                int grade = Integer.parseInt(string.substring(firstIndex, lastIndex));

                labClass.add(new Student(name, grade));
            }
        }
        catch (FileNotFoundException e) {
            err.println("Такого файла нет!");
        }

    }
}