package data;

import java.util.Scanner;

public class CarsV2 {

    //Khai bao mang
    Car[] list = new Car[IMyLibrary.MAX];
    int count = 0;

    public boolean importCars() {
        if (count >= IMyLibrary.MAX) {
            System.out.println("Danh sach da day!");
            return false;
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so xe:");
        int soxe = Integer.parseInt(sc.nextLine());

        do {
            Car a = new Car();
            a.importCar();

            if (!checkSameID(a.getId())) {
                list[count] = a;
                count++;
            } else {
                System.out.println("ID bi trung, nhap lai!");
            }

        } while (count < soxe);

        return true;
    }

    public void exportCars() {
        if (count == 0) {
            System.out.println("DS Xe rong!!!");
        } else {
            System.out.println("Danh sach xe hoi:");
            for (int i = 0; i < count; i++) {
                list[i].exportCar();
            }
        }
    }

    public boolean checkSameID(String IDtoCheck) {
        for (int i = 0; i < count; i++) {
            if ((list[i].getId().equals(IDtoCheck))) {
                return true;
            }
        }
        return false;
    }

    public Car timkiem(String IDtoCheck) {
        for (int i = 0; i < count; i++) {
            if ((list[i].getId().equals(IDtoCheck))) {
                return list[i];
            }
        }
        return null;
    }
// chú ý public Car voi Cars, mang array ....

    public boolean editInformation(String id) {
        Car kq = timkiem(id);
        if (kq != null) {
            System.out.println("Nhap ten moi: ");
            Scanner sc = new Scanner(System.in);
            String infor_moi = sc.nextLine();
            kq.setOwner(infor_moi);
            return true;
        } else {
            return false;
        }
    }

    public boolean xoaXe(String id) {
        //xoa thao tac tren vi tri
        //sua thao tac tren dia chi
        Car kq = timkiem(id);
        if (kq != null) {
            int vitri = timKiemV2(id);
            for (int i = vitri; i < count - 1; i++) {
                list[vitri] = list[vitri + 1];
                i++;
            }
            count--;
            return true;
        } else {
            return false;
        }
    }

    public int timKiemV2(String IDtoCheck) {
        for (int i = 0; i < count; i++) {
            if ((list[i].getId().equals(IDtoCheck))) {
                return i;
            }
        }
        return -1;
    }

    public Car[] layXetheoOwner(String ten) {
        //tra ve 1 array, nhieu hoc vien
        Car[] kq = new Car[IMyLibrary.MAX];
        int soxe = 0;
        for (int i = 0; i < count; i++) {
            if (list[i].getOwner().contains(ten)) {
                kq[soxe] = list[i];
                soxe++;
            }
        }
        return kq;
    }

    public int countByBrand(String brand) {
        int temp = 0;
        for (int i = 0; i < count; i++) {
            if (list[i].getBrand().equalsIgnoreCase(brand)) {
                temp++;
            }
        }
        return temp;
    }

    public void brandWithMostCars() {
        if (count == 0) {
            System.out.println("Danh sach rong!");
            return;
        }

        String max = "";
        if (countByBrand("Mercedes") < countByBrand("Lexus")) {
            max = "Lexus";
        } else if (countByBrand("Mercedes") < countByBrand("Lexus")) {
            max = "Lexus";
        }
    }

    public void brandWithMostCarsV2() {
        int mercedes = 0;
        int audi = 0;
        int lexus = 0;

        for (int i = 0; i < count; i++) {
            if (list[i].getBrand().equalsIgnoreCase("Mercedes")) {
                mercedes++;
            }
            if (list[i].getBrand().equalsIgnoreCase("Audi")) {
                audi++;
            }
            if (list[i].getBrand().equalsIgnoreCase("Lexus")) {
                audi++;
            }

        }
    }

    public void brandWithMostCarsV3() {
        if (count == 0) {
            System.out.println("Danh sach rong!");
            return;
        }

        int max = 0;
        String brandMax = "";

        for (int i = 0; i < count; i++) {
            int dem = 0;
            for (int j = 0; j < count; j++) {
                if (list[j].getBrand().equalsIgnoreCase(list[i].getBrand())) {
                    dem++;
                }
            }

            if (dem > max) {
                max = dem;
                brandMax = list[i].getBrand();
            }
        }

        System.out.println("Hang co nhieu xe nhat: " + brandMax + " (" + max + " xe)");
    }

    public String brandWithFewestCars() {
        
        int mercedes = countByBrand("Mercedes");
        int audi = countByBrand("Audi");
        int lexus = countByBrand("Lexus");
        
       if ((mercedes < audi) && (mercedes < lexus)) {return "Mercedes";}
       if ((audi < mercedes) && (audi < lexus)) {return "Audi";}
       if ((lexus < audi) && (lexus < mercedes)) {return "Lexus";}

      
       return null;
    }
    }
