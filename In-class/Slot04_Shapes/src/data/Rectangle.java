
package data;

import java.util.Scanner;

public class Rectangle {

    public double length;
    public double width;



    public double getArea() {
        return length * width;
    }

    public double getPerimeter() {
        return (length + width) * 2;
    }

    public void importInfor() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length: ");
        length = sc.nextInt();

        System.out.print("Enter width: ");
        width = sc.nextInt();

    }
    public void exportInfor() {
        System.out.println("\n========== INFORMATION ==========");
        System.out.println("Area       : " + getArea());
        System.out.println("Perimeter  : " + getPerimeter());
        System.out.println("=====================================");
    }
}
