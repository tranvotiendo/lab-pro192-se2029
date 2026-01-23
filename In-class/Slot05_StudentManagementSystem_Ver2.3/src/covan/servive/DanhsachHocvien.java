/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package covan.servive;

import covan.lopcoban.Hocvien;

/**
 *
 * @author user
 */
//lop nay tao ra de quan ly nhieu Hocvien
//cau truc du lieu de lam nhat: su dung array

public class DanhsachHocvien {
    //khai bao va khoi tao array 
    private Hocvien[] list=new Hocvien[IMyConstants.MAX];
    private int count=0;
    
    //them nhieu Hocvien vao array
    public boolean themHocvien(){
        if(count>=IMyConstants.MAX) return false;
        do{
            Hocvien a=new Hocvien();
            a.nhapHocvien();
            if( kiemtraTrungMa(a.getMa())){
               list[count]=a;
               count++;
            }
        }while(count<IMyConstants.MAX);
        return true;
    }    
    //ham nay de xuat nhieu hocvien cua array ra man hinh
    public void xuatDSHocvien(){
        if(count==0){
            System.out.println("ds hoc vien trong");
        }
        else{
           System.out.println("Danh sach hoc vien:");
           for(int i=0;i<count;i++){
              list[i].xuatHocvien();
           }
        }
    }
    
    //ham nay de check trung Ma hoc vien trong mang list
    public boolean kiemtraTrungMa(int macancheck){
        for(int i=0;i<count;i++){
            if(list[i].getMa()==macancheck) return true;
        }
        return false;                
    }
}
