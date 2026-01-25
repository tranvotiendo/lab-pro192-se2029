package data;

import java.util.Scanner;

public class Cars {

    private int MAX = 20;
    private Car[] list = new Car[MAX];
    private int count = 0;

    public boolean importCars() {
        if (count >= MAX) {
            System.out.println("Danh sach da day!");
            return false;
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so xe:");
        int soxe = sc.nextInt();

        do {
            Car a = new Car();
            a.importCar();

            if (!checkSameID(a.getId())) {
                list[count] = a;
                count++;
            } else {
                System.out.println("ID bi trung, nhap lai!");
            }

        } while (count < soxe);

        return true;
    }

    public void exportCars() {
        if (count == 0) {
            System.out.println("DS Xe rong!!!");
        } else {
            System.out.println("Danh sach xe hoi:");
            for (int i = 0; i < count; i++) {
                list[i].exportCar();
            }
        }
    }

    public boolean checkSameID(String IDtoCheck) {
        for (int i = 0; i < count; i++) {
            if ((list[i].getId().equals(IDtoCheck))) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Cars ds_xe = new Cars();
        ds_xe.importCars();
        ds_xe.exportCars();
    }
}
