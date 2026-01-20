/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package covan.view;

import covan.lopcoban.Hocvien;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class MyApp {
    public static void main(String[] args) {
        int choice=0;
        //tao 1 object Hoc vien
        Hocvien a=new Hocvien();
       
        do{
           Scanner sc=new Scanner(System.in);
           System.out.println("1.nhap hv");
           System.out.println("2.xuat hv");
           System.out.println("3. xuat hp can dong");
           System.out.println("enter choice:"); 
           choice=sc.nextInt();
            switch (choice) {
                case 1:
                    a.nhapHocvien();
                    break;
                case 2:
                    a.xuatHocvien();
                    break;
                case 3:
                    System.out.println("hoc phi can dong:"+ a.tinhHocphiSauGiamGia(20));
                    break;
            }
        }while(choice<=3);
    }
}
