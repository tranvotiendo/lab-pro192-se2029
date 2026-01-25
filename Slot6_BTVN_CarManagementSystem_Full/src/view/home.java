package view;

import data.Car;
import data.Cars;
import java.util.Scanner;

public class home {

    public static void main(String[] args) {
        int choice = 0;
        Cars carManager = new Cars();
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println();
            System.out.println("========================================");
            System.out.println("           CAR MANAGEMENT SYSTEM         ");
            System.out.println("========================================");
            System.out.println("1. Input car information");
            System.out.println("2. Display car list");
            System.out.println("3. Edit car information");
            System.out.println("4. Delete car information");
            System.out.println("5. Search car");
            System.out.println("6. Count cars by brand");
            System.out.println("7. Brand with the most cars");
            System.out.println("8. Brand with the fewest cars");
            System.out.println("9. Total price of each brand");
            System.out.println("0. Exit");
            System.out.println("========================================");
            System.out.print(">> Your choice: ");

            choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    System.out.println("\n--- INPUT CAR INFORMATION ---");
                    if (carManager.importCars()) {
                        System.out.println("Cars added successfully!");
                    } else {
                        System.out.println("Cannot add cars. The list is full!");
                    }
                    break;

                case 2:
                    System.out.println("\n--- CAR LIST ---");
                    carManager.exportCars();
                    break;

                case 3:
                    System.out.println("\n--- EDIT CAR INFORMATION ---");
                    System.out.print("Enter car ID to edit: ");
                    String editId = scanner.nextLine();
                    if (carManager.editInformation(editId)) {
                        System.out.println("Update successful!");
                    } else {
                        System.out.println("Car not found!");
                    }
                    break;

                case 4:
                    System.out.println("\n--- DELETE CAR ---");
                    System.out.print("Enter car ID to delete: ");
                    String deleteId = scanner.nextLine();
                    if (carManager.deleteCar(deleteId)) {
                        System.out.println("Delete successful!");
                    } else {
                        System.out.println("Car not found!");
                    }
                    break;

                case 5:
                    int searchChoice = 0;
                    do {
                        System.out.println("\n--- SEARCH MENU ---");
                        System.out.println("1. Search by ID");
                        System.out.println("2. Search by Owner");
                        System.out.println("0. Back to main menu");
                        System.out.print(">> Your choice: ");

                        searchChoice = Integer.parseInt(scanner.nextLine());

                        switch (searchChoice) {
                            case 1:
                                System.out.print("Enter car ID: ");
                                String searchId = scanner.nextLine();
                                Car foundCar = carManager.search(searchId);

                                if (foundCar != null) {
                                    System.out.println("Car found:");
                                    foundCar.exportCar();
                                } else {
                                    System.out.println("No car found with this ID!");
                                }
                                break;

                            case 2:
                                System.out.print("Enter owner name: ");
                                String ownerName = scanner.nextLine();
                                Car[] foundCars = carManager.getCarsByOwner(ownerName);
                                boolean isFound = false;

                                for (int i = 0; i < foundCars.length; i++) {
                                    if (foundCars[i] != null) {
                                        foundCars[i].exportCar();
                                        isFound = true;
                                    }
                                }

                                if (!isFound) {
                                    System.out.println("No cars found for this owner!");
                                }
                                break;

                            case 0:
                                break;

                            default:
                                System.out.println("Invalid choice!");
                        }
                    } while (searchChoice != 0);
                    break;

                case 6:
                    System.out.println("\n--- COUNT CARS BY BRAND ---");
                    System.out.print("Enter brand name: ");
                    String brandName = scanner.nextLine();
                    int totalCars = carManager.countByBrand(brandName);
                    System.out.println("Total cars of brand " + brandName + ": " + totalCars);
                    break;

                case 7:
                    System.out.println("\n--- BRAND WITH MOST CARS ---");
                    carManager.brandWithMostCars();
                    System.out.println();
                    break;

                case 8:
                    System.out.println("\n--- BRAND WITH FEWEST CARS ---");
                    carManager.brandWithFewestCars();
                    break;

                case 9:
                    System.out.println("\n--- TOTAL PRICE BY BRAND ---");
                    carManager.calculatePrice();
                    break;

                case 0:
                    System.out.println("\nThank you for using the program. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again!");
            }

        } while (choice != 0);
    }
}
