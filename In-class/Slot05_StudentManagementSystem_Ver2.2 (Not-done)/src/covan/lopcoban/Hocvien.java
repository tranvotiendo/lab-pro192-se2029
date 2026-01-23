package covan.lopcoban;

import java.util.Scanner;

public class Hocvien {
    //Khai bao fields

    private int ma;  //phsm vi su dung: trong cung 1 class (khi de truoc thanh phan field hoac methods)
    private String hoten;
    private double hocphi;
    private boolean trangthai;

    //default constructor
    //1. Không có void, int, main...
    //2. Ten ham trung ten Class
    //3. Chi duoc phep su dung no sau chu new
    //Moi class deu co no
    public Hocvien() {
        this.ma = ma;
        this.hoten = hoten;
        this.hocphi = hocphi;
        this.trangthai = trangthai;
    }

    public Hocvien(int ma, String hoten, double hocphi, boolean trangthai) {
        this.ma = ma;
        this.hoten = hoten;
        this.hocphi = hocphi;
        this.trangthai = trangthai;
    }

    //Hay tao 1 constructor
    /* Ma = 1 so random tu 10 - 1000
    hoten gan theo input parameter
    hocphi default = 500
     */
    public Hocvien(String name) {
        this.ma = (int) (Math.random()*1000)%901+10;
        this.hoten = hoten;
        this.hocphi = 500;
        this.trangthai = false;
    }
    
    /* Viet 1 constructor de gan 4 fields theo input param*/
    public Hocvien(Hocvien hv){
        this.ma = hv.ma;
        this.hoten = hv.hoten;
        this.hocphi = hv.hocphi;
        this.trangthai = hv.trangthai;        
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
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

    
    
    //Compiler tu them vao, giup gan gia tri mac dinh ban dau/ default vao vung nho sau khi new
    //Moi data deu phai co du lieu (Java)
    //Khai bao Methods 
    //Target: nhap tu ban phim vao cac fileds
    public void nhapHocVien() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input id: ");
        this.ma = Integer.parseInt(sc.nextLine());
        //Neu ghi "ma" khong, compiler tu chuyen thanh "this.ma"
        sc = new Scanner(System.in);
        System.out.print("Input name: ");
        this.hoten = sc.nextLine();

        System.out.print("Input hoc phi: ");
        this.hocphi = Double.parseDouble(sc.nextLine());

        System.out.print("Input trang thai: ");
        this.trangthai = Boolean.parseBoolean(sc.nextLine());

    }

    public void xuatHocVien() {
        System.out.println("----THONG TIN SINH VIEN VUA NHAP----");
        System.out.println("Mã: " + ma);
        System.out.println("Họ tên: " + hoten);
        System.out.printf("Học phí: %.2f \n", hocphi);
        System.out.println("Trạng thái: " + trangthai);
    }

    public double tinhHocphiSauGiamGia(double giagiam) {
        return hocphi - giagiam;
    }
    
    private String formatName() {
        return this.hoten.toUpperCase();
    }
}
