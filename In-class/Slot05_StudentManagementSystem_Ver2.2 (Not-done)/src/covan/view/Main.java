package covan.view;

import covan.service.DanhsachHocvien;
import java.util.Scanner;

/**
 *
 * @author tranv
 */
public class Main {

    public static void main(String[] args) {
        int choice = 0;
        DanhsachHocvien dshv = new DanhsachHocvien();
        do {
            System.out.println("1. Tao DS hoc vien");
            System.out.println("2. Xuat DS hoc vien");
            System.out.println("3. Chinh sua thong tin 1 hoc vien");
            System.out.println("4. Xoa thong tin 1 hoc vien");
            System.out.println("5. Tim kiem thong tin hoc vien dua vao ID, name, status");
            System.out.println("6. Them 1 hoc vien moi"); //CRUD

            Scanner sc = new Scanner(System.in);
            System.out.println("Nhap lua chon cua ban: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    if (dshv.themHocVien()) {
                        System.out.println("Da nhap xong DSHV!!!");
                    } else {
                        System.out.println("DS da FULL!!!");
                    }
                    //Them nhieu hoc vien
                    break;

                case 2:
                    dshv.xuatDanhSachHocVien();
                    break;

                case 3:

                    break;

                case 4:

                    break;

                case 5:

                    break;
                case 6:

                    break;
            }
        } while (choice <= 6);
    }
}
