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
public class MyApp2 {
     public static void main(String[] args) {
         Hocvien a=new Hocvien();
         a.nhapHocvien();
         a.xuatHocvien();
         //chi xuat ten cua hocvien a
         System.out.println("ten cua a:" + a.getHoten());
         //sua ho ten cua hoc vien a
         Scanner sc=new Scanner(System.in);
         System.out.println("nhap ten moi can thay:");
         String hoten_moi=sc.nextLine();
         a.setHoten(hoten_moi);
         //in ra "PASS" neu hoc vien a co trang thai la true va nglai
         if(a.isTrangthai()){
             System.out.println("hoc vien nay da pass mon");
         }
         else{
             System.out.println("hoc vien nay chua pass");            
         }
          
         Hocvien b=new Hocvien(2,"thuy kieu", 200, true);
         b.xuatHocvien();
         Hocvien c=new Hocvien("ma giam sinh");
         c.xuatHocvien();
         Hocvien d=new Hocvien(b);
         d.xuatHocvien();
         Hocvien e=b;
         e.xuatHocvien();
         
    }
    
}
