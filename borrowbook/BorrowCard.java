package oop.homework2.borrowbook;

import java.time.LocalDate;
import java.util.Scanner;

public class BorrowCard extends InformationStudent {
    private String id;
    private LocalDate borrowDate;
    private LocalDate term;
    private String numberOfBook;

    public BorrowCard() {

    }

    public BorrowCard(String id, LocalDate borrowDate, LocalDate term, String numberOfBook) {
        this.id = id;
        this.borrowDate = borrowDate;
        this.term = term;
        this.numberOfBook = numberOfBook;
    }

    public BorrowCard(String name, LocalDate dateOfBirth, int age, String nameClass, String id, LocalDate borrowDate, LocalDate term, String numberOfBook) {
        super(name, dateOfBirth, age, nameClass);
        this.id = id;
        this.borrowDate = borrowDate;
        this.term = term;
        this.numberOfBook = numberOfBook;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LocalDate getBorrowDate() {
        return borrowDate;
    }

    public void setBorrowDate(LocalDate borrowDate) {
        this.borrowDate = borrowDate;
    }

    public LocalDate getTerm() {
        return term;
    }

    public void setTerm(LocalDate term) {
        this.term = term;
    }

    public String getNumberOfBook() {
        return numberOfBook;
    }

    public void setNumberOfBook(String numberOfBook) {
        this.numberOfBook = numberOfBook;
    }

    public void input() {
        super.input();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập id phiếu : ");
        id = scanner.nextLine();
        do {
            System.out.println("Nhập ngày mượn : ");
            borrowDate = LocalDate.parse(scanner.nextLine());
        } while (borrowDate.isBefore(this.getDateOfBirth()));

        do {
            System.out.println("Nhập hạn trả : ");
            term = LocalDate.parse(scanner.nextLine());
        } while (term.isBefore(borrowDate));
        System.out.println("Nhập số hiệu sách : ");
        numberOfBook = scanner.nextLine();
    }
    @Override
    public String toString() {
        return "id: " + id + ", borrowDate: " + borrowDate + ", term: " + term + ", number of book: " + numberOfBook + ", " + super.toString();
    }
}
