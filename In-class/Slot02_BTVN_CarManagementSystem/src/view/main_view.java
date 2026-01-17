package view;

import data.Car;
import java.util.Scanner;

public class main_view {

    public static void main(String[] args) {
        int choice = 0;
        Car a = new Car();
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("\n================= MENU =================");
            System.out.println("1. Input car information");
            System.out.println("2. Display car information");
            System.out.println("0. Exit");
            System.out.print("Choose an option: ");

            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    a.importCar();
                    System.out.println("Car information has been added successfully!");
                    break;

                case 2:
                    a.exportCar();
                    break;

                case 0:
                    System.out.println("Exit programming...");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again!");
            }
        } while (choice != 0);
    }
}
