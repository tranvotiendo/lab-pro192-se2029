/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

import java.util.Scanner;

/**
 *
 * @author tranv
 */
public class NewShapes {

    public static void main(String[] args) {

        Square s1 = new Square();
        Triangle t1 = new Triangle();
        Rectangle r1 = new Rectangle();
        Circle c1 = new Circle();

        int choice = 0;

        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("\n================= MENU =================");
            System.out.println("1. Input new Square");
            System.out.println("2. Input new Triangle");
            System.out.println("3. Input new Rectangle");
            System.out.println("4. Input new Circle");
            System.out.print("Choose an option: ");

            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    s1.importInfor();
                    s1.exportInfor();
                    System.out.println("Information has been added successfully!");
                    break;

                case 2:
                    t1.importInfor();
                    t1.exportInfor();
                    System.out.println("Information has been added successfully!");
                    break;

                case 3:
                    r1.importInfor();
                    r1.exportInfor();
                    System.out.println("Information has been added successfully!");
                    break;

                case 4:
                    c1.importInfor();
                    c1.exportInfor();
                    System.out.println("Information has been added successfully!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again!");
            }
        } while (choice != 0);
    }
}
