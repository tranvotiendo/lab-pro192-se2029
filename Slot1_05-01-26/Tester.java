/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tester;

/**
 *
 * @author tranv
 */
public class Tester { //Hàm Test nhu cô

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int x = 6;

        // Tạo đối tượng
        Hocvien a = new Hocvien();

        // Gán giá trị cho các thuộc tính của đối tượng a
        a.id = 1;
        a.hoten = "Thi no";
        a.hocphi = 100;
        a.trangthai = true;

        System.out.println("--- Ket qua ---");
//        a.inThongTin();

        // Call hàm input HV
        Hocvien b = new Hocvien();
        b.nhapHV();

        System.out.println("--- Thong Tin Sinh Vien Vua Nhap ---");
        b.inThongTin();

    }
}
