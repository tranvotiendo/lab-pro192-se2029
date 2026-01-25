package data;
/**
 *
 * @author tranvotiendo
 */
import java.util.Scanner;

public class Cars {

    // Declare array
    Car[] cars = new Car[IMyLibrary.MAX];
    int size = 0;

    public boolean importCars() {
        if (size >= IMyLibrary.MAX) {
            System.out.println("The list is full!");
            return false;
        }

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of cars: ");
        int numCars = Integer.parseInt(sc.nextLine());

        do {
            Car car = new Car();
            car.importCar();

            if (!checkSameID(car.getId())) {
                cars[size] = car;
                size++;
            } else {
                System.out.println("Duplicate ID, please re-enter!");
            }

        } while (size < numCars);

        return true;
    }

    public void exportCars() {
        if (size == 0) {
            System.out.println("Car list is empty!");
        } else {
            System.out.println("\n==================== CAR LIST ====================");
            System.out.printf("| %-10s | %-10s | %-15s | %-12s |\n",
                              "ID", "Brand", "Owner", "Price");
            System.out.println("--------------------------------------------------");

            for (int i = 0; i < size; i++) {
                System.out.printf("| %-10s | %-10s | %-15s | %-12d |\n",
                        cars[i].getId(),
                        cars[i].getBrand(),
                        cars[i].getOwner(),
                        cars[i].getPrice());
            }

            System.out.println("==================================================");
        }
    }

    public boolean checkSameID(String id) {
        for (int i = 0; i < size; i++) {
            if (cars[i].getId().equals(id)) {
                return true;
            }
        }
        return false;
    }

    public Car search(String id) {
        for (int i = 0; i < size; i++) {
            if (cars[i].getId().equals(id)) {
                return cars[i];
            }
        }
        return null;
    }

    public boolean editInformation(String id) {
        Car foundCar = search(id);
        if (foundCar != null) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter new owner name: ");
            String newOwner = sc.nextLine();
            foundCar.setOwner(newOwner);
            return true;
        }
        return false;
    }

    public boolean deleteCar(String id) {
        Car foundCar = search(id);
        if (foundCar != null) {
            int index = searchIndex(id);
            for (int i = index; i < size - 1; i++) {
                cars[i] = cars[i + 1];
            }
            size--;
            return true;
        }
        return false;
    }

    public int searchIndex(String id) {
        for (int i = 0; i < size; i++) {
            if (cars[i].getId().equals(id)) {
                return i;
            }
        }
        return -1;
    }

    public Car[] getCarsByOwner(String owner) {
        Car[] result = new Car[IMyLibrary.MAX];
        int resultSize = 0;

        for (int i = 0; i < size; i++) {
            if (cars[i].getOwner().contains(owner)) {
                result[resultSize] = cars[i];
                resultSize++;
            }
        }
        return result;
    }

    public int countByBrand(String brand) {
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (cars[i].getBrand().equalsIgnoreCase(brand)) {
                count++;
            }
        }
        return count;
    }

    public void brandWithMostCars() {
        if (size == 0) {
            System.out.println("The list is empty!");
            return;
        }

        int max = 0;
        int mercedes = countByBrand("Mercedes");
        int audi = countByBrand("Audi");
        int lexus = countByBrand("Lexus");

        if (mercedes > max) max = mercedes;
        if (audi > max) max = audi;
        if (lexus > max) max = lexus;

        if (mercedes == max) System.out.print("Mercedes ");
        if (audi == max) System.out.print("Audi ");
        if (lexus == max) System.out.print("Lexus ");
    }

    public void brandWithFewestCars() {
        if (size == 0) {
            System.out.println("The list is empty!");
            return;
        }

        int mercedes = countByBrand("Mercedes");
        int audi = countByBrand("Audi");
        int lexus = countByBrand("Lexus");

        int min = mercedes;
        if (audi < min) min = audi;
        if (lexus < min) min = lexus;

        if (mercedes == min) System.out.print("Mercedes ");
        if (audi == min) System.out.print("Audi ");
        if (lexus == min) System.out.print("Lexus ");
    }

    public void calculatePrice() {
        long mercedesTotal = 0;
        long audiTotal = 0;
        long lexusTotal = 0;

        for (int i = 0; i < size; i++) {
            if (cars[i].getBrand().equals("Mercedes")) {
                mercedesTotal += cars[i].getPrice();
            } else if (cars[i].getBrand().equals("Audi")) {
                audiTotal += cars[i].getPrice();
            } else if (cars[i].getBrand().equals("Lexus")) {
                lexusTotal += cars[i].getPrice();
            }
        }

        System.out.println("Mercedes: " + mercedesTotal);
        System.out.println("Audi: " + audiTotal);
        System.out.println("Lexus: " + lexusTotal);
    }
}
