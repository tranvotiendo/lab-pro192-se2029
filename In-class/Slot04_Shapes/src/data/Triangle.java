package data;

import java.util.Scanner;

public class Triangle {

    public double a;
    public double b;
    public double c;
//    public double Area;
//    public double Perimeter;


    public double getPerimeter() {
        return a + b + c;
    }

    public double getArea() {
        double p = (getPerimeter()) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    public void importInfor() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a: ");
        a = sc.nextInt();

        System.out.print("Enter b: ");
        b = sc.nextInt();

        System.out.print("Enter c: ");
        c = sc.nextInt();

    }

    public void exportInfor() {
        System.out.println("\n========== INFORMATION ==========");
        System.out.println("Area       : " + getArea());
        System.out.println("Perimeter  : " + getPerimeter());
        System.out.println("=====================================");
    }
}
