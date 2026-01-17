
package covan.view;

import covan.lopcoban.Hocvien;


public class MyAppV2 {
    public static void main(String[] args) {
        Hocvien a = new Hocvien(1, "hi", 1, true);
        Hocvien b = new Hocvien();
        Hocvien c = new Hocvien("hehehe");
        a.xuatHocVien();
        b.xuatHocVien();
        c.xuatHocVien();
        Hocvien d = new Hocvien(b); // copy object/ clone obj (tao obj moi nhung lay fields tu cai cu)
        d.xuatHocVien();
        //Nhin vao code co bn obj, dap an in ra la gi
        Hocvien e = b;
        e.xuatHocVien();
}
}
