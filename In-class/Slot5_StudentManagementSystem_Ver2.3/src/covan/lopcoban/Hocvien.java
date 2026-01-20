/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package covan.lopcoban;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Hocvien {
    //khai bao fields
    private int ma;
    private String hoten;
    private float hocphi;
    private boolean trangthai;
    
    //khai bao methods
    //default constructor
    public Hocvien(){
        this.ma=1;
        this.hocphi=100;
        this.hoten="chi pheo";
        this.trangthai=true;
    }
    //constructor with parameters
    public Hocvien(int ma, String hoten, float hocphi, boolean trangthai){
        this.ma=ma;
        this.hoten=hoten;
        this.hocphi=hocphi;
        this.trangthai=trangthai;
    }
    //hay tao 1 contructor de gan : 
     /*ma= 1 so random tu 10-1000;
       hoten gan theo input parameter
       hoc phi defaul=500
       trang thai default=false */
    public Hocvien(String hoten){
        this.ma=(int)(Math.random()*1000)%901+10;
        this.hoten=hoten;
        this.hocphi=500;
        this.trangthai=false;
    }
    //viet 1 constructor da gan 4 fields theo input param
    public Hocvien(Hocvien hv){
        this.ma=hv.ma;
        this.hoten=hv.hoten;
        this.hocphi=hv.hocphi;
        this.trangthai=hv.trangthai;
    }
    //target: nhap tu ban phim vao cac fields
    public void nhapHocvien(){
        Scanner sc=new Scanner(System.in);
        System.out.println("nhap ma hoc vien:");
        this.ma=sc.nextInt();
        System.out.println("nhap ho ten:");
        sc=new Scanner(System.in);
       
        this.hoten=sc.nextLine();
        System.out.println("nhap hoc phi:");
        this.hocphi=sc.nextFloat();
        System.out.println("nhap trang thai:");
        this.trangthai=sc.nextBoolean();
    }
    public void xuatHocvien(){
        /* System.out.println("ma:"+ this.ma);
         System.out.println("ho ten:" + this.hoten);
         System.out.println("hoc phi:"+ hocphi);
         System.out.println("trang thai:" + trangthai);*/
         System.out.printf("%10s%20s%20s%20s\n","MA","HOTEN","HOCPHI","TRANGTHAI");
         System.out.printf("%10s%20s%20.2f%20s\n",this.ma,formatName(),this.hocphi,this.trangthai);
    }
    public float tinhHocphiSauGiamGia(float giagiam){
        
        return this.hocphi-giagiam;
    }
    private String formatName(){
        return this.hoten.toUpperCase();
    }
    //nhom getters
    //ham nay de lay field hoten
    public String getHoten(){
        return this.hoten;
    }
    //setters
    //ham cho phep chinh sua 1 field
    public void setHoten(String hoten_moi){
        if(hoten_moi!=null && !hoten_moi.isEmpty())
           this.hoten=hoten_moi;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        if(ma>0)
           this.ma = ma;
    }

    public float getHocphi() {
        return hocphi;
    }

    public void setHocphi(float hocphi) {
       if(hocphi>0) 
          this.hocphi = hocphi;
    }

    public boolean isTrangthai() {
        return trangthai;
    }

    public void setTrangthai(boolean trangthai) {
        this.trangthai = trangthai;
    }
    
}
