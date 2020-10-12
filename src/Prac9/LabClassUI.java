package Prac9;

import java.util.Scanner;

import static java.lang.System.*;

public class LabClassUI {
    LabClass labClass;


    public LabClassUI() {
        labClass = new LabClass();
        LabClassDriver driver = new LabClassDriver(labClass);
        Scanner in = new Scanner(System.in);
        out.println("Хотите ли вы создать новый список или добавить к исходному?");
        out.println("[1] - Создать новый");
        out.println("[2] - Добавить к исходому");
        out.println("[0] - Назад");
        int n = in.nextInt();
        switch (n){
            case 1:
                driver.createLabClass();
                break;
            case 2:
                driver.fillLabClass();
                driver.addStudent();
                break;
            case 0:
                driver.fillLabClass();
                return;
        }
        driver.saveLabCLass();
        driver.fillLabClass();

    }

    public int findStudent(int i) {
        Scanner in = new Scanner(System.in);
        if (i % 3 == 0) {
            err.println("Введите 0, чтобы выйти");
            i++;
        } else i++;
        String name = "null";
        out.print("Введите имя студента: ");
        try {
            name = (in.nextLine()).toLowerCase();
            if (name.isEmpty()) {
                throw new EmptyStringExeption("Вы ввели пустую строку!");
            }
            if (name.equals("0")) {
                return i;
            }
        } catch (EmptyStringExeption e) {
            err.println(e.getMessage());
            out.println();
            findStudent(i);
            return 0;
        }

        try {
            out.println(labClass.find(name).toString());
        } catch (StudentNotFoundExeption e) {
            err.println(e.getMessage());
        }
        return i;
    }

    public static void main(String[] args) {
        LabClassUI app = new LabClassUI();
        Scanner in = new Scanner(System.in);
        int n, i = 0;
        while(true)
        {
            out.println("Выберите действие: ");
            out.println("[1] - Найти студента");
            out.println("[2] - Добавить студента");
            out.println("[0] - Выход из программы");
            out.print("Действие: ");
            n = in.nextInt();
            switch (n){
                case 1:
                    i = app.findStudent(i);
                    break;
                case 2:
                    app = new LabClassUI();
                    break;
                case 0:
                    exit(0);
                    break;
            }
            out.println("----------------------------");
        }
    }
}
