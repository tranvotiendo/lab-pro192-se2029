/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package covan.servive;

import covan.lopcoban.Hocvien;
import java.util.Scanner;

/**
 *
 * @author user
 */
//lop nay tao ra de quan ly nhieu Hocvien
//cau truc du lieu de lam nhat: su dung array
public class DanhsachHocvien {

    //khai bao va khoi tao array 
    private Hocvien[] list = new Hocvien[IMyConstants.MAX];
    private int count = 0;

    //them nhieu Hocvien vao array
    public boolean themHocvien() {
        if (count >= IMyConstants.MAX) {
            System.out.println("Danh sach da day!");
            return false;
        }

        do {
            Hocvien a = new Hocvien();
            a.nhapHocvien();

            if (!kiemtraTrungMa(a.getMa())) {
                list[count] = a;
                count++;
            } else {
                System.out.println("ID bi trung, nhap lai!");
            }

        } while (count < IMyConstants.MAX);

        return true;
    }

    //ham nay de xuat nhieu hocvien cua array ra man hinh
    public void xuatDSHocvien() {
        if (count == 0) {
            System.out.println("ds hoc vien trong");
        } else {
            System.out.println("Danh sach hoc vien:");
            for (int i = 0; i < count; i++) {
                list[i].xuatHocvien();
            }
        }
    }

    //ham nay de check trung Ma hoc vien trong mang list
    public boolean kiemtraTrungMa(int macancheck) {
        for (int i = 0; i < count; i++) {
            if (list[i].getMa() == macancheck) {
                return true;
            }
        }
        return false;
    }

    //ham nay de tim kiem hoc vien theo ma
    public Hocvien timkiem(int ma) {
        //muon lay dia chi thi data type la ten class
        //dung ten class de mo ta data type
        for (int i = 0; i < count; i++) {
            if (list[i].getMa() == ma) {
                return list[i];
            }
        }
        return null;
    }

    public boolean editTTHV(int ma) {
        Hocvien kq = timkiem(ma);
        if (kq != null) {
            System.out.println("Nhap ten moi: ");
            Scanner sc = new Scanner(System.in);
            String hoten_moi = sc.nextLine();
            kq.setHoten(hoten_moi);
            return true;
        } else {
            return false;
        }
    }

    public boolean xoaHV(int ma) {
        //xoa thao tac tren vi tri
        //sua thao tac tren dia chi
        Hocvien kq = timkiem(ma);
        if (kq != null) {
            int vitri = timKiemV2(ma);
            for (int i = vitri; i < count - 1; i++) {
                list[vitri] = list[vitri + 1];
                i++;
            }
            count--;
            return true;
        } else {
            return false;
        }
    }

    public int timKiemV2(int ma) {
        for (int i = 0; i < count; i++) {
            if (list[i].getMa() == ma) {
                return i;
            }
        }
        return -1;
    }

    public void xuatHVtheoTenV1(String ten) {
        for (int i = 0; i < count; i++) {
            if (list[i].getHoten().contains(ten)) {
                list[i].xuatHocvien();
            }
        }
    }

    public Hocvien[] layHVtheoTen(String ten) {
        //tra ve 1 array, nhieu hoc vien
        Hocvien[] kq = new Hocvien[IMyConstants.MAX];
        int sohv = 0;
        for (int i = 0; i < count; i++) {
            if (list[i].getHoten().contains(ten)) {
                kq[sohv] = list[i];
                sohv++;
            }
        }
        return kq;
    }

    public Hocvien[] timHVtheoTT(boolean status) {
        Hocvien[] kq2 = new Hocvien[IMyConstants.MAX];
        int sohv2 = 0;
        for (int i = 0; i < count; i++) {
            if (list[i].isTrangthai() == status) {
                kq2[sohv2] = list[i];
                sohv2++;
            }
        }
        return kq2;
    }

    public boolean them1Hocvien() {
        if (count >= IMyConstants.MAX) {
            System.out.println("Danh sach da day!");
            return false;
        }

        Hocvien hv = new Hocvien();
        hv.nhapHocvien();   // nhập thông tin cho học viên

        if (kiemtraTrungMa(hv.getMa())) {
            System.out.println("Ma hoc vien bi trung!");
            return false;
        }

        list[count] = hv;
        count++;

        System.out.println("Them hoc vien thanh cong!");
        return true;
    }

}
