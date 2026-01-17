
package covan.view;

import covan.lopcoban.Hocvien;
import java.util.Scanner;


public class MyApp {

    public static void main(String[] args) {
        int choice = 0;
        Hocvien a = new Hocvien();
        //Tao 1 obj hoc vien, lay ten lop lm kieu du lieu va dung no de khai bao bien
        do {
            System.out.println("\n----- MENU -----");
            System.out.println("1. Nhap thong tin nhan vien");
            System.out.println("2. Xuat thong tin nhan vien");
            System.out.println("3. Xuat HP can dong");
            System.out.println("0. Thoat");
            System.out.print("Chon chuc nang: ");

            Scanner sc = new Scanner(System.in);
            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    
                    System.out.println("Them hoc vien thanh cong!");
                    break;

                case 2:
                    a.xuatHocVien();
                    break;

                case 3:

                    break;

                case 0:
                    System.out.println("Thoat chuong trinh!");
                    break;

                default:
                    System.out.println("Lua chon khong hop le!");
            }
        } while (choice <= 3);
    }
}

//2 cach: truc tiep vao properties, gian tiep thong qua method --> cach 2 hay hon
//Slot 3: Access Modifiers - Encapsulation - che day thong tin
//1.
//2. Import
//3. Access
//Class dat trong package -> tên: day du package + name
//Neu co nhieu phan cap thi phai day du: a.a1.Hocvien
//This -> obj hien hanh // important