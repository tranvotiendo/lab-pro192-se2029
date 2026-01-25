/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Trial3;

/**
 *
 * @author tranv
 */
public class DanhsachHocvien3 {

    public final int MAX = 3;
    //1. Khai bao - khoi tao Mang 

    private Hocvien3[] list = new Hocvien3[MAX];
    private int count = 0;

    public boolean themHocvien() {
        if (count >= MAX) {
            System.out.println("Danh sach da day!");
            return false;
        }

        do {
            Hocvien3 a = new Hocvien3();
            a.nhapHocvien();

            if (!findID(a.getId())) {
                list[count] = a;
                count++;
            } else {
                System.out.println("ID bi trung, nhap lai!");
            }

        } while (count < MAX);

        return true;
    }

    public boolean findID(int IDtoCheck) {
        for (int i = 0; i < count; i++) {
            if (list[i].getId() == IDtoCheck) {
                return true;
            }
        }
        return false;
    }

    public void xuatDSHocvien() {
        if (count == 0) {
            System.out.println("DSHV rong!!!");
        } else {
            System.out.println("Danh sach hoc vien:");
            System.out.printf("%10s%20s%20s%20s\n", "ID", "HOTEN", "HOCPHI", "TRANGTHAI");
            for (int i = 0; i < count; i++) {
                list[i].xuatHocvien();
            }
        }
    }
    
}
