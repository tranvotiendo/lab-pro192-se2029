
import java.util.Scanner;

public class Home_System {

    public static void main(String[] args) {
        int choice;
        Employee a = new Employee();
        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Nhap thong tin nhan vien");
            System.out.println("2. Xuat thong tin nhan vien");
            System.out.println("3. In bang luong");
            System.out.println("0. Thoat");
            System.out.print("Chon chuc nang: ");

            Scanner sc = new Scanner(System.in);
            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    a.inputNhanVien();
                    System.out.println("Them nhan vien thanh cong!");
                    break;

                case 2:
                    a.ouputNhanVien();
                    break;

                case 3:
                    System.out.println("Input so ngay cong: ");
                    int date_work = Integer.parseInt(sc.nextLine());
                    a.printBangLuong(date_work);
                    break;

                case 0:
                    System.out.println("Thoat chuong trinh!");
                    break;

                default:
                    System.out.println("Lua chon khong hop le!");
            }

        } while (choice != 0);
    }
}
