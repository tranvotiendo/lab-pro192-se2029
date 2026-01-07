/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package slot1_execirse1;

import java.util.Scanner;

/**
 *
 * @author tranv
 */
public class Hocvien {

    // Attributes/Fields
    int id;
    String hoten;
    double hocphi;
    boolean trangthai;

    // Method
    public void nhapHV() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input id: ");
        this.id = Integer.parseInt(sc.nextLine());

        System.out.print("Input name: ");
        this.hoten = sc.nextLine();

        System.out.print("Input hoc phi: ");
        this.hocphi = Double.parseDouble(sc.nextLine());

        System.out.print("Input trang thai: ");
        this.trangthai = Boolean.parseBoolean(sc.nextLine());
        
        //Chua bo sung try-catch xu ly loi
    }

    public void inThongTin() {
        System.out.println("Mã: " + id);
        System.out.println("Họ tên: " + hoten);
        System.out.println("Học phí: " + hocphi);
        System.out.println("Trạng thái: " + trangthai);
    }

}
