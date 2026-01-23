/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package covan.view;

import covan.servive.DanhsachHocvien;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class Main {
    public static void main(String[] args) {
        int choice=0;
        DanhsachHocvien dshv=new DanhsachHocvien();
        do{
            System.out.println("1. tao ds hoc vien");
            System.out.println("2. xuat ds hoc vien");
            System.out.println("3. chinh sua thong tin 1 hoc vien");
            System.out.println("4. xoa thong tin 1 hoc vien");
            System.out.println("5. tim kiem hoc vien dua vao ma|ten|trangthai");
            System.out.println("6. Them 1 hoc vien moi");
            Scanner sc=new Scanner(System.in);
            System.out.println("nhap lua chon:");
            choice=sc.nextInt();
            switch (choice) {
                case 1:
                    if(dshv.themHocvien())//them nhieu hv
                    {
                        System.out.println("da nhap xong ds hoc vien");
                    }
                    else{
                        System.out.println("khong them hoc vien. DS da full");
                    }
                    break;
                case 2:
                    dshv.xuatDSHocvien();
                    break;
            }
        }while(choice<=6);
    }
}
