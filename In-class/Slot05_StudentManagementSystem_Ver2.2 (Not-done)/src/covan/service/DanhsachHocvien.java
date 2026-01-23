package covan.service;

//Lop nay tao ra de quan ly nhieu hoc vien
import covan.lopcoban.Hocvien;

//Cau truc du lieu de lam nhat: su dung array
public class DanhsachHocvien {

    //Khai bao va khoi tao array
//    private Hocvien[] list = new Hocvien[5]; Cach nay khong hay do bi hard code
    private Hocvien[] list = new Hocvien[MyConstant.MAX];
    private int count = 0;

    //Them nhieu Hoc vien vao array
    public boolean themHocVien() {
        if (count > MyConstant.MAX) {
            return false;
        }

        do {
            Hocvien a = new Hocvien();
            a.nhapHocVien();
            if (checkSameID(a.getMa())) {
                list[count] = a;
                count++;
            }

        } while (count < MyConstant.MAX);
        return true;
    }

    public void xuatDanhSachHocVien() {
        System.out.println("Danh sach sinh vien");
        if (count > 0) {
            for (int i = 0; i < count; i++) {
                list[i].xuatHocVien();
            }
        } else {
            System.out.println("DS rong!");
        }

    }

    //Ham nay check trung ID hoc vien trong list
    public boolean checkSameID(int idToCheck) {
        for (int i = 0; i < count; i++) {
            if (list[i].getMa() == idToCheck) {
                return true;
            }
        }

        return false;
    }
}
