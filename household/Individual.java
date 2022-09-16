package oop.homework2.household;

import java.time.LocalDate;
import java.util.Scanner;

public class Individual {

    public static Scanner scanner = new Scanner(System.in);
    private String name;
    private LocalDate dateOfBirth;
    private String job;

    public Individual() {

    }

    public Individual(String name, LocalDate dateOfBirth, String job) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.job = job;
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

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public void inputInd() {
        System.out.println("Nhập tên : ");
        name = scanner.nextLine();
        System.out.println("Nhập ngày sinh : ");
        dateOfBirth = LocalDate.parse(scanner.nextLine());
        System.out.println("Nhập nghề nghiệp : ");
        job = scanner.nextLine();
    }

    public String outputInd() {
        return "Name = " + name + ", date of birth = " + dateOfBirth + ", job = " + job;
    }

    public boolean testAge() {
        if (LocalDate.now().getYear() - dateOfBirth.getYear() < 18) {
            return true;
        } else {
            return false;
        }
    }
}
