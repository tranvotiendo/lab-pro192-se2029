/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

/**
 *
 * @author tranv
 */
public class Student {

    private int id;
    private String name;
    private double hocphi;
    private boolean trangthai;

    public Student(int id, String name, double hocphi, boolean trangthai) {
        this.id = id;
        this.name = name;
        this.hocphi = hocphi;
        this.trangthai = trangthai;
    }

    public Student() {
        this.id = id;
        this.name = name;
        this.hocphi = hocphi;
        this.trangthai = trangthai;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHocphi() {
        return hocphi;
    }

    public void setHocphi(double hocphi) {
        this.hocphi = hocphi;
    }

    public boolean isTrangthai() {
        return trangthai;
    }

    public void setTrangthai(boolean trangthai) {
        this.trangthai = trangthai;
    }

    public void xuatHocVien() {
        System.out.println("----THONG TIN SINH VIEN VUA NHAP----");
        System.out.println("Mã: " + id);
        System.out.println("Họ tên: " + name);
        System.out.printf("Học phí: %.2f \n", hocphi);
        System.out.println("Trạng thái: " + trangthai);
    }

}
