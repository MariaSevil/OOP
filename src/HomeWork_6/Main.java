package HomeWork_6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public class Main {

    public static void main(String[] args) {
        //Применяем DIP
        //Мы зависим от абстракции( интерфейсов) и инвертируем управление через конструкторы для передачизависимостей.

        TeacherView teacherView = new TeacherViewImpl();
        TeacherPresenter presenter = new TeacherPresenterImpl(teacherView);
       // Создание и вывод учителей
        presenter.createTeacher("Семен", "Семенович", "Семенов");
        presenter.createTeacher("Петр", "Петрович", "Петров");
        presenter.createTeacher("Александр", "Александрович", "Александров");

        presenter.sortTeachers();
        presenter.displayAllTeacher();
    }
}