package Trial1;

public class DanhsachHocvien {

    //1. Khai bao - khoi tao Mang 
    public final int MAX = 5;
    private Hocvien[] list = new Hocvien[MAX];
    private int count = 0;

    //2. Them nhieu Hocvien vao Mang
    public boolean themHocvien() {
        if (count >= MAX) {
            return false;
        }
        do {
            Hocvien a = new Hocvien();
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
            if (list[i].getId()== IDtoCheck) {
                return true;
            }
        }
        return false;
    }
}
