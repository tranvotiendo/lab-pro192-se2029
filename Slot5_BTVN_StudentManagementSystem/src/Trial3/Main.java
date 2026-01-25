
package Trial3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int choice = 0;
        DanhsachHocvien3 dshv = new DanhsachHocvien3();
        do {
            System.out.println("1. Tao DS hoc vien");
            System.out.println("2. Xuat DS hoc vien");
            System.out.println("3. Chinh sua thong tin 1 hoc vien");
            System.out.println("4. Xoa thong tin 1 hoc vien");
            System.out.println("5. Tim kiem hoc vien");
            System.out.println("6. Them 1 hoc vien");
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhap lua chon:");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    if (dshv.themHocvien())
                    {
                        System.out.println("Them DSHV thanh cong!");
                    } else {
                        System.out.println("DS da day, khong the them hoc vien!!!");
                    }
                    break;
                case 2:
                    dshv.xuatDSHocvien();
                    break;
                    
                case 5: 
                    System.out.println("Nhap ID sinh vien can tim");
                    int ID = Integer.parseInt(sc.nextLine());
                    if (dshv.findID(ID)) {
                        System.out.println("Tim thay hoc vien voi ID " + ID);
                        
                    } else System.out.println("Khong tim thay HV");
            }
        } while (choice <= 6);
    }
}
