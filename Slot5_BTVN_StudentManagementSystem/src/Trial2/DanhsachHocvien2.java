/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Trial2;

import Trial2.Hocvien2;

/**
 *
 * @author tranv
 */
public class DanhsachHocvien2 {
    //1. Khai bao - khoi tao Mang 

    public final int MAX = 5;
    private Hocvien2[] list = new Hocvien2[MAX];
    private int count = 0;

    //2. Them nhieu Hocvien vao Mang
    public boolean themHocvien() {
        if (count >= MAX) {
            return false;
        }
        do {
            Hocvien2 a = new Hocvien2();
            a.nhapHocvien();
            if (checkSameID(a.getId())) {
                list[count] = a;
                count++;
            }
        } while (count < MAX);
        return true;
    }

    public void xuatDSHocvien() {
        if (count == 0) {
            System.out.println("DS hoc vien trong!");
        } else {
            System.out.println("Danh sach hoc vien:");
            for (int i = 0; i < count; i++) {
                list[i].xuatHocvien();
            }
        }
    }

    public boolean checkSameID(int IDtoCheck) {
        for (int i = 0; i < count; i++) {
            if (list[i].getId() == IDtoCheck) {
                return true;
            }
        }
        return false;
    }
}
