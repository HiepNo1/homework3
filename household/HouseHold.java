package oop.homework2.household;

import java.time.LocalDate;

public class HouseHold extends Individual {
    private int quantityPeople;
    private int apartmentNumber;

    private Individual individual[] = new Individual[10];
    public HouseHold() {

    }

    public HouseHold(int quantityPeople, int apartmentNumber, Individual[] individual) {
        this.quantityPeople = quantityPeople;
        this.apartmentNumber = apartmentNumber;
        this.individual = individual;
    }

    public int getQuantityPeople() {
        return quantityPeople;
    }

    public void setQuantityPeople(int quantityPeople) {
        this.quantityPeople = quantityPeople;
    }

    public int getApartmentNumber() {
        return apartmentNumber;
    }

    public void setApartmentNumber(int apartmentNumber) {
        this.apartmentNumber = apartmentNumber;
    }

    public Individual[] getIndividual() {
        return individual;
    }

    public void setIndividual(Individual[] individual) {
        this.individual = individual;
    }

    public void inputHou() {
        System.out.println("Nhập số nhà : ");
        this.apartmentNumber = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhập số lượng thành viên :");
        this.quantityPeople = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < this.quantityPeople; i++) {
            System.out.println("Thành viên thứ " + (i + 1));
            this.individual[i] = new Individual();
            this.individual[i].inputInd();
        }
    }

    public void outputHou() {
        System.out.println("Số nhà : " + this.apartmentNumber);
        System.out.println("Thông tin các thành viên :");
        for (int i = 0; i < this.quantityPeople; i++) {
            System.out.println(this.individual[i].outputInd());
        }
    }
    public int calculateElectricBill(int quantityDay) {
        return this.quantityPeople * 2000 * quantityDay;
    }

    public int quantityChild() {
        int count = 0;
        for (int i = 0; i < this.quantityPeople; i++) {
            if (this.individual[i].testAge()) {
                count ++;
            }
        }
        return count;
    }
}
