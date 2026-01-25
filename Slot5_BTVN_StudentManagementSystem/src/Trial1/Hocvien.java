package Trial1;

import java.util.Scanner;

public class Hocvien {

    private int id;
    private String hoten;
    private float hocphi;
    private boolean trangthai;

    public Hocvien() {
        this.id = id;
        this.hoten = hoten;
        this.hocphi = hocphi;
        this.trangthai = trangthai;
    }

    public Hocvien(int id, String hoten, float hocphi, boolean trangthai) {
        this.id = id;
        this.hoten = hoten;
        this.hocphi = hocphi;
        this.trangthai = trangthai;
    }

    public void nhapHocvien() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap MSHV:");
        this.id = sc.nextInt();
        System.out.println("Nhap ten SV:");
        sc.nextInt();
        this.hoten = sc.nextLine();
        System.out.println("Nhap hoc phi:");
        this.hocphi = sc.nextFloat();
        System.out.println("Nhap trang thai:");
        this.trangthai = sc.nextBoolean();
    }

    public void xuatHocvien() {
        System.out.printf("%10s%20s%20s%20s\n", "MA", "HOTEN", "HOCPHI", "TRANGTHAI");
        System.out.printf("%10s%20s%20.2f%20s\n", this.id, formatName(), this.hocphi, this.trangthai);
    }

    private String formatName() {
        return this.hoten.toUpperCase();
    }

    public void setHoten(String hoten_moi) {
        if (hoten_moi != null && !hoten_moi.isEmpty()) {
            this.hoten = hoten_moi;
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getHocphi() {
        return hocphi;
    }

    public void setHocphi(float hocphi) {
        this.hocphi = hocphi;
    }

    public boolean isTrangthai() {
        return trangthai;
    }

    public void setTrangthai(boolean trangthai) {
        this.trangthai = trangthai;
    }

    public String getHoten() {
        return hoten;
    }

}
