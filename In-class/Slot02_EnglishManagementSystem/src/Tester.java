
public class Tester {
    public static void main(String[] args) {
        //Tao 1 Object
        Hocvien a = new Hocvien();
        //Hoc vien la datatype, a la ten bien
        a.nhapHocVien();
        a.xuatHocVien();
        
        Hocvien b = new Hocvien();
        b.nhapHocVien();
        b.xuatHocVien();
        System.out.println("Hoc phi phai dong sau giam gia: " + b.tinhHocphiSauGiamGia(100));
    }
}
