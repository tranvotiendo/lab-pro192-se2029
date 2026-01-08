
import java.time.LocalDate;
import java.util.Scanner;

public class Employee {

    public int id;
    public String name;
    public double salary;
    public int yob;

    double getBHXH() {
        return 1.2 * salary;
    }

    double getBHYT() {
        return 0.07 * salary;
    }

    double getBHTN() {
        return 0.05 * salary;
    }

    double getThuNhapTruocThue(double date_work) {
        return salary * (date_work - (getBHTN() + getBHXH() + getBHYT()));
    }

    double getTAX(double date_work) {
        double thuNhap = getThuNhapTruocThue(date_work);

        if (thuNhap <= 15_500_000) {
            return 0;
        } else if (15_500_000 < thuNhap && thuNhap <= 20_000_000) {
            return 0.1 * (thuNhap - 15_500_000);
        } else if (20_000_000 < thuNhap && thuNhap <= 30_000_000) {
            return 0.1 * 4_500_000
                    + 0.2 * (thuNhap - 20_000_000);
        } else {
            return 0.1 * 4_500_000 + 0.2 * 14_500_000 + 0.35 * (thuNhap - 30_000_000);
        }
    }

    double getThuNhapThucLanh(double date_work) {
        return getThuNhapTruocThue(date_work) - getTAX(date_work);
    }

    void inputNhanVien() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input id: ");
        id = Integer.parseInt(sc.nextLine());
        //Neu ghi "ma" khong, compiler tu chuyen thanh "this.ma"
        sc = new Scanner(System.in);
        System.out.print("Input name: ");
        name = sc.nextLine();

        System.out.print("Input tien luong: ");
        salary = Double.parseDouble(sc.nextLine());

        System.out.print("Input yob: ");
        yob = Integer.parseInt(sc.nextLine());
        
    }

    void ouputNhanVien() {
        System.out.println("----THONG TIN NHAN VIEN VUA NHAP----");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.printf("Salary: %.2f \n", salary);
        System.out.println("Yob: " + yob);
    }
    void printBangLuong(double date_work) {
        LocalDate today = LocalDate.now();
        System.out.println("---- BANG LUONG THANG " + today.getMonthValue() + " NAM " + today.getYear() + " ----");
        System.out.println("----THONG TIN CA NHAN----");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.printf("Salary: %.2f \n", salary);
        System.out.println("Yob: " + yob);
        System.out.println("----THONG TIN HUONG BAO HIEM----");
        System.out.println("BHYT: " + getBHYT());
        System.out.println("BHXH: " + getBHXH());
        System.out.println("BHTN: " + getBHTN());
        System.out.println("----THONG TIN LUONG/ THUE----");
        System.out.println("Thu nhap truoc thue: " + getThuNhapTruocThue(date_work));
        System.out.println("Thu nhap thuc lanh: " + getThuNhapThucLanh(date_work));
        System.out.println("Thue TNCN: " + getTAX(date_work));
        
    }
}
