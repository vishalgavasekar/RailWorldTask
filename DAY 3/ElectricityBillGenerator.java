package TASKS;

import java.util.Scanner;

public class ElectricityBillGenerator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of units consumed: ");
        int unitsConsumed = scanner.nextInt();

        double billAmount = calculateBill(unitsConsumed);
        System.out.println("Electricity bill amount: Rs. " + billAmount);

        scanner.close();
    }

    public static double calculateBill(int unitsConsumed) {
        return unitsConsumed <= 100 ? unitsConsumed * 2
                : unitsConsumed <= 150 ? 100 * 2 + (unitsConsumed - 100) * 3
                : unitsConsumed <= 200 ? 100 * 2 + 50 * 3 + (unitsConsumed - 150) * 4
                : unitsConsumed <= 250 ? 100 * 2 + 50 * 3 + 50 * 4 + (unitsConsumed - 200) * 5
                : unitsConsumed <= 300 ? 100 * 2 + 50 * 3 + 50 * 4 + 50 * 5 + (unitsConsumed - 250) * 6
                : unitsConsumed <= 500 ? 100 * 2 + 50 * 3 + 50 * 4 + 50 * 5 + 50 * 6 + (unitsConsumed - 300) * 7
                : 100 * 2 + 50 * 3 + 50 * 4 + 50 * 5 + 50 * 6 + 200 * 7 + (unitsConsumed - 500) * 8;
    }
}
