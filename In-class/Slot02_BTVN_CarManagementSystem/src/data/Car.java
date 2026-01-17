package data;

import java.util.Scanner;

public class Car {

    private String id;
    private String owner;
    private String brand;
    private long price;

    // 5 constructors
    public Car(String id, String owner, String brand, long price) {
        this.id = id;
        this.owner = owner;
        this.brand = brand;
        this.price = price;
    }

    public Car() {
        this.id = id;
        this.owner = owner;
        this.brand = brand;
        this.price = price;
    }

    public Car(String id, String owner) {
        this.id = id;
        this.owner = owner;
    }

    public Car(String id) {
        this.id = id;
    }

    public Car(String brand, long price) {
        this.brand = brand;
        this.price = price;
    }

    public boolean checkID(String s) {
        if (s.length() != 10) return false;

        if (!Character.isDigit(s.charAt(0)) || !Character.isDigit(s.charAt(1)))
            return false;

        if (!Character.isUpperCase(s.charAt(2)))
            return false;

        if (s.charAt(3) != '-')
            return false;

        for (int i = 4; i <= 6; i++) {
            if (!Character.isDigit(s.charAt(i)))
                return false;
        }

        if (s.charAt(7) != '.')
            return false;

        if (!Character.isDigit(s.charAt(8)) || !Character.isDigit(s.charAt(9)))
            return false;

        return true;
    }

    public void importCar() {
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("================================");
            System.out.print("Enter Car ID (Format: 50M-147.47): ");
            id = sc.nextLine();

            if (!checkID(id)) {
                System.out.println("Invalid format. Please try again!");
            }
        } while (!checkID(id));

        System.out.print("Enter owner's name: ");
        owner = sc.nextLine();

        int choice;
        do {
            System.out.println("\nChoose car brand:");
            System.out.println("1. Mercedes");
            System.out.println("2. Audi");
            System.out.println("3. Lexus");
            System.out.print("Your choice (1-3): ");

            choice = sc.nextInt();
            sc.nextLine(); // clear buffer

            switch (choice) {
                case 1:
                    brand = "Mercedes";
                    break;
                case 2:
                    brand = "Audi";
                    break;
                case 3:
                    brand = "Lexus";
                    break;
                default:
                    System.out.println("Invalid choice. Please try again!");
            }
        } while (choice < 1 || choice > 3);

        System.out.print("Enter car price (VND): ");
        price = Long.parseLong(sc.nextLine());
    }

    public void exportCar() {
        System.out.println("\n========== CAR INFORMATION ==========");
        System.out.println("Car ID    : " + id);
        System.out.println("Owner     : " + owner);
        System.out.println("Brand     : " + brand);
        System.out.printf ("Price     : %,d VND%n", price);
        System.out.println("=====================================");
    }
}
