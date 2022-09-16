package oop.homework2.borrowbook;

import java.util.Scanner;

public class Retry {
    public static void main(String[] args) {
        BorrowCard borrowCard[];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số lượng thẻ mượn :");
        int quantityCard = scanner.nextInt();
        scanner.nextLine();
        borrowCard = new BorrowCard[quantityCard];
        for (int i = 0; i < quantityCard; i++) {
            borrowCard[i] = new BorrowCard();
            System.out.println("Nhập thông tin thẻ mượn thứ " + (i + 1));
            borrowCard[i].input();
        }
        System.out.println("--------------------------------------");
        System.out.println("Thông tin các thẻ mượn vừa nhập là :");
        for (BorrowCard element : borrowCard) {
            System.out.println(element.toString());
        }
        int count = 0;
        for (BorrowCard element : borrowCard) {
            if (element.getNameClass().equals("CNTT2"))
            count ++;
        }
        System.out.println("Số thẻ mượn của lớp CNTT2 là " + count);
    }
}
