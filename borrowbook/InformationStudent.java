package oop.homework2.borrowbook;

import java.time.LocalDate;
import java.util.Scanner;

public class InformationStudent {
    private String name;
    private LocalDate dateOfBirth;
    private int age;
    private String nameClass;

    public InformationStudent() {

    }

    public InformationStudent(String name, LocalDate dateOfBirth, int age, String nameClass) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.age = age;
        this.nameClass = nameClass;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNameClass() {
        return nameClass;
    }

    public void setNameClass(String nameClass) {
        this.nameClass = nameClass;
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên sinh viên : ");
        name = scanner.nextLine();
        do {
            System.out.println("Nhập ngày sinh : ");
            dateOfBirth = LocalDate.parse(scanner.nextLine());
            age = LocalDate.now().getYear() - dateOfBirth.getYear();
        } while (age <= 0);
        System.out.println("Nhập tên lớp : ");
        nameClass = scanner.nextLine();
    }
    @Override
    public String toString() {
        return "Name: " + name + ", date of birth: " + dateOfBirth + ", age: " + age + ", Class: " + nameClass;
    }

}
