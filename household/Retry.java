package oop.homework2.household;

import java.time.LocalDate;
import java.util.Scanner;

public class Retry {
    public static void main(String[] args) {
        HouseHold houseHold[];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số hộ dân : ");
        int quantityHouseHold = scanner.nextInt();
        scanner.nextLine();
        houseHold = new HouseHold[quantityHouseHold];
        for (int i = 0; i < houseHold.length; i++) {
            houseHold[i] = new HouseHold();
            System.out.println("Thông tin hộ dân thứ " + (i + 1));
            houseHold[i].inputHou();
        }
        System.out.println("-------------------------------------------");
        System.out.println("Thông tin các hộ dân vừa nhập :");
        for (int i = 0; i < houseHold.length; i++) {
            System.out.println("Hộ dân thứ " + (i + 1));
            houseHold[i].outputHou();
        }
        System.out.println("-------------------------------------------");
        int inputMonth = 0;
        do {
            System.out.println("Nhập tháng : ");
            inputMonth = scanner.nextInt();
            scanner.nextLine();
        } while (inputMonth < 0 || inputMonth > 12);
        int quantityDay = 0;
        if (inputMonth == 2) {
            System.out.println("Nhập vào năm :");
            int inputYear = scanner.nextInt();
            scanner.nextLine();
            if ((inputYear % 4 == 0 && inputYear % 100 != 0) || (inputYear % 400 == 0)) {
                quantityDay = 29;
            } else {
                quantityDay = 28;
            }
        } else if (inputMonth == 4 || inputMonth == 6 || inputMonth == 9 || inputMonth == 11) {
            quantityDay = 30;
        } else {
            quantityDay = 31;
        }
        int maxElectricBill = 0;
        for (int i = 0; i < houseHold.length; i++) {
            maxElectricBill = houseHold[0].calculateElectricBill(quantityDay);
            if (maxElectricBill < houseHold[i].calculateElectricBill(quantityDay)) {
                maxElectricBill =  houseHold[i].calculateElectricBill(quantityDay);
            }
        }
        System.out.println("Hộ dân sử dụng nhiều điện nhất là :");
        for (HouseHold element : houseHold) {
            if (element.calculateElectricBill(quantityDay) == maxElectricBill) {
                element.outputHou();
            }
        }
        int count = 0;
        for (int i = 0; i < houseHold.length; i++) {
            count += houseHold[i].quantityChild();
        }
        System.out.println("Số lượng trẻ em là : " + count);
    }
}
