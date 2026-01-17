
import java.util.Scanner;

//Cach de tao ra kieu du lieu moi
//Dung datatype -> nay de tao obj du lieu khi program run
public class Hocvien {

    //Khai bao fields
    int ma;
    String hoten;
    double hocphi;
    boolean trangthai;

    //Khai bao Methods 
    //Target: nhap tu ban phim vao cac fileds
    void nhapHocVien() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input id: ");
        this.ma = Integer.parseInt(sc.nextLine());
        //Neu ghi "ma" khong, compiler tu chuyen thanh "this.ma"
        sc = new Scanner(System.in);
        System.out.print("Input name: ");
        this.hoten = sc.nextLine();

        System.out.print("Input hoc phi: ");
        this.hocphi = Double.parseDouble(sc.nextLine());

        System.out.print("Input trang thai: ");
        this.trangthai = Boolean.parseBoolean(sc.nextLine());

    }

    void xuatHocVien() {
        System.out.println("----THONG TIN SINH VIEN VUA NHAP----");
        System.out.println("Mã: " + ma);
        System.out.println("Họ tên: " + hoten);
        System.out.printf("Học phí: %.2f \n", hocphi);
        System.out.println("Trạng thái: " + trangthai);
    }

    double tinhHocphiSauGiamGia(double giagiam) {
        return hocphi - giagiam;
    }
}

