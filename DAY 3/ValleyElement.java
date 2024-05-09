package DSA;

import java.util.Scanner;

public class ValleyElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();

        int a[] = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        for (int i = 1; i < a.length - 1; i++) {
            if (a[i - 1] > a[i] && a[i] < a[i + 1]) {
                System.out.println("Valley Element: " + a[i]);
            }
        }

        sc.close();
    }
}
