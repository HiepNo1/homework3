package oop.homework2.time;

import java.time.LocalDate;
import java.util.Scanner;

public class TheNextDay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào ngày hiện tại : ");
        LocalDate inputTime = LocalDate.parse(scanner.nextLine());
        System.out.println("Ngày tiếp theo là : " + inputTime.plusDays(1));
    }
}
