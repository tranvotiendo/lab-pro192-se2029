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
public class Circle {

    public double radious;


    public double getPerimeter() {
        return 2 * Math.PI * radious;
    }

    public double getArea() {
        return radious * radious * Math.PI;
    }

    public void importInfor() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radious: ");
        radious = sc.nextInt();

    }

    public void exportInfor() {
        System.out.println("\n========== INFORMATION ==========");
        System.out.println("Area       : " + getArea());
        System.out.println("Perimeter  : " + getPerimeter());
        System.out.println("=====================================");
    }
}
