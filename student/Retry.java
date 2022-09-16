package oop.homework1.student;

import java.time.LocalDate;
import java.util.Scanner;

import static java.time.LocalDate.of;
import static java.time.LocalDate.parse;

public class Retry {
    public static Scanner scanner = new Scanner(System.in);
    public static void importInformation(Student student) {
        System.out.println("Nhập id : ");
        student.setId(scanner.nextInt());
        scanner.nextLine();
        System.out.println("Nhập họ tên : ");
        student.setName(scanner.nextLine());
        System.out.println("Nhập địa chỉ : ");
        student.setAddress(scanner.nextLine());
        do {
            System.out.println("Nhập số điện thoại gồm 7 chữ số : ");
            student.setPhone(scanner.nextLine());
        } while (student.getPhone().length() != 7);
        System.out.println("Nhập ngày sinh : ");
        student.setDateOfBirth(LocalDate.parse(scanner.nextLine()));
    }

    public static void exportInformation(Student student) {
        System.out.printf("%-5d %-15s %-15s %-15s %-15s \n", student.getId(), student.getName(), student.getAddress(), student.getPhone(), student.getDateOfBirth());
    }

    public static void main(String[] args) {
        Student student[];
        System.out.println("Nhập số lượng sinh viên : ");
        int inputQuantity = scanner.nextInt();
        student = new Student[inputQuantity];
        for (int i = 0; i < inputQuantity; i++) {
            System.out.println("Sinh viên thứ " + (i + 1) + " : ");
            student[i] = new Student();
            importInformation(student[i]);
        }
        System.out.println("Thông tin sinh viên vừa nhập :");
        System.out.printf("%-5s %-15s %-15s %-15s %-15s \n", "ID", "Name", "Address", "Phone", "Date of Birth");
        System.out.println("Trước khi sắp xếp :");
        for (Student element : student) {
            exportInformation(element);
        }
        System.out.println("Sau khi sắp xếp theo id:");
        Student sort;
        for (int i = 0; i < student.length - 1; i++) {
            for (int j = i + 1; j < student.length; j++) {
                if (student[i].getId() > student[j].getId()) {
                    sort = student[j];
                    student[j] = student[i];
                    student[i] = sort;
                }
            }
        }
        for (Student element : student) {
            exportInformation(element);
        }
        System.out.println("Sau khi sắp xếp theo ngày sinh :");
        Student temp;
        for (int i = 0; i < student.length - 1; i++) {
            for (int j = i + 1; j < student.length; j++) {
                if (student[i].getDateOfBirth().isAfter(student[j].getDateOfBirth())) {
                    temp = student[i];
                    student[i] = student[j];
                    student[j] = temp;
                }
            }
        }
        for (Student element : student) {
            exportInformation(element);
        }
    }
}
