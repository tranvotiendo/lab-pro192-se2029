/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package covan.view;

import covan.lopcoban.Hocvien;
import covan.servive.DanhsachHocvien;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class Main {

    public static void main(String[] args) {
        int choice = 0;
        DanhsachHocvien dshv = new DanhsachHocvien();
        do {
            System.out.println("============================================");
            System.out.println("1. Tao DS hoc vien");
            System.out.println("2. Xuat DS hoc vien");
            System.out.println("3. Chinh sua thong tin 1 hoc vien");
            System.out.println("4. Xoa thong tin 1 hoc vien");
            System.out.println("5. Tim kiem hoc vien theo ma|ten|trangthai");
            System.out.println("6. Them 1 hoc vien");
            System.out.println("7. Thoat");
            System.out.println("============================================");
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhap lua chon:");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    if (dshv.themHocvien())//them nhieu hv
                    {
                        System.out.println("da nhap xong ds hoc vien");
                    } else {
                        System.out.println("khong them hoc vien. DS da full");
                    }
                    break;
                case 2:
                    dshv.xuatDSHocvien();
                    break;

                case 3:
                    System.out.println("Nhap ma SV can sua: ");
                    int ma_sua = sc.nextInt();
                    if (dshv.editTTHV(ma_sua)) {
                        System.out.println("Sua thanh cong");
                    } else {
                        System.out.println("Khong the sua do khong tim thay SV");
                    }
                    break;

                case 4:
                    System.out.println("Nhap ma SV can xoa: ");
                    int ma_xoa = sc.nextInt();
                    if (dshv.xoaHV(ma_xoa)) {
                        System.out.println("Xoa thanh cong");
                    } else {
                        System.out.println("Khong the xoa do khong tim thay SV");
                    }
                    break;

                case 5:
                    do {
                        System.out.println("Your choice");
                        System.out.println("1. Tim theo Ma SV");
                        System.out.println("2. Tim theo Ten SV");
                        System.out.println("3. Tim theo trang thai SV");

                        System.out.println("nhap lua chon:");
                        choice = Integer.parseInt(sc.nextLine());

                        switch (choice) {
                            case 1:
                                System.out.println("Nhap ma SV can tim: ");
                                int ma_tim = Integer.parseInt(sc.nextLine());
                                ;

                                if (dshv.timkiem(ma_tim) != null) {
                                    System.out.println("Tim thay HV voi ma so " + ma_tim);
                                    dshv.timkiem(ma_tim).xuatHocvien();
                                } else {
                                    System.out.println("Khong tim thay SV");
                                }
                                break;
                            case 2:
                                System.out.println("Nhap ten SV can tim: ");
                                String ten_tim = sc.nextLine();
                                Hocvien[] dsTimThay = dshv.layHVtheoTen(ten_tim);
                                boolean timThay = false;

                                for (int i = 0; i < dsTimThay.length; i++) {
                                    if (dsTimThay[i] != null) {
                                        dsTimThay[i].xuatHocvien();
                                        timThay = true;
                                    }
                                }

                                if (!timThay) {
                                    System.out.println("Khong tim thay hoc vien nao!");
                                }
                                break;

                            case 3:
                                System.out.println("Your choice");
                                System.out.println("1. Trang thai TRUE");
                                System.out.println("2. Trang thai FALSE");

                                System.out.println("Nhap lua chon:");
                                choice = Integer.parseInt(sc.nextLine());

                                switch (choice) {
                                    case 1:
                                        Hocvien[] dsTimThay2 = dshv.timHVtheoTT(true);
                                        boolean timThay2 = false;

                                        for (int i = 0; i < dsTimThay2.length; i++) {
                                            if (dsTimThay2[i] != null) {
                                                dsTimThay2[i].xuatHocvien();
                                                timThay2 = true;
                                            }
                                        }

                                        if (!timThay2) {
                                            System.out.println("Khong tim thay hoc vien nao!");
                                        }
                                        break;
                                    case 2:
                                        Hocvien[] dsTimThay3 = dshv.timHVtheoTT(true);
                                        boolean timThay3 = false;

                                        for (int i = 0; i < dsTimThay3.length; i++) {
                                            if (dsTimThay3[i] != null) {
                                                dsTimThay3[i].xuatHocvien();
                                                timThay3 = true;
                                            }
                                        }

                                        if (!timThay3) {
                                            System.out.println("Khong tim thay hoc vien nao!");
                                        }
                                        break;
                                }

                        }

                    } while (choice <= 3);
                case 6:
                    dshv.them1Hocvien();
            }

        } while (choice <= 6);
    }
}
