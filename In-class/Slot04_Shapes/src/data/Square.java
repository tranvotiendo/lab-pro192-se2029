
package data;

import java.util.Scanner;

/**
 *
 * @author tranv
 */
public class Square {

    public double edge;
//    public double Area;
//    public double Perimeter;

    public Square() {
        this.edge = edge;
    }

    public Square(double edge) {
        this.edge = edge;
    }

    public double getArea() {
        return edge * edge;
    }

    public double getPerimeter() {
        return 4 * edge;
    }

    public void importInfor() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter edge: ");
        edge = sc.nextInt();

    }

    public void exportInfor() {
        System.out.println("\n========== INFORMATION ==========");
        System.out.println("Area       : " + getArea());
        System.out.println("Perimeter  : " + getPerimeter());
        System.out.println("=====================================");
    }
}
