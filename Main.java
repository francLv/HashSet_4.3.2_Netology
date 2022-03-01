//package ru.netology;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    static Set<Student> studentMap = new HashSet<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Демонстрация
        demo();

        //Реализация задачи
        System.out.println("Введите информацию о студенте: " +
                "\"ФИО, номер группы, номер студенческого билета\"");
        while (true) {
            String input = scanner.nextLine();
            if ("end".equals(input)) {
                printMap();
                break;
            } else {
                String[] split = input.split(",");
                String name = split[0];
                String group = split[1];
                String studentId = split[2];
                Student student = new Student(name, group, studentId);
                studentMap.add(student);
            }
        } 
      scanner.close();
    }

    static void printMap() {
        System.out.println("Список студентов:");
        for (Student student : studentMap) System.out.println(student);
    }

    static void demo() {
        Student student1 = new Student("Иванов Иван Иванович", "123-Б", "123");
        Student student2 = new Student("Петров Петр Птерович", "123-А", "321");
        Student student3 = new Student("Сидоров Сидр Сидорович", "123-С", "258");
        Student student4 = new Student("Козлов Козел Петрович", "123-Т", "123");
        Student student5 = new Student("Иванов Иван Иванович", "123-Б", "456");
        studentMap.add(student1);
        studentMap.add(student2);
        studentMap.add(student3);
        studentMap.add(student4);
        studentMap.add(student5);
        printMap();
    }
}
