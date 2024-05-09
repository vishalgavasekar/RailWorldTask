package DSA;//Peak Element:
// Condition: An element is a peak if it is not smaller than its neighbors. In other words, if the element 
//at index i is greater than or equal to both the element at index i-1 (if i is not the first element) and 
//the element at index i+1 (if i is not the last element), then it is a peak.
// Example: In the array [1, 3, 2, 4, 1], the peak element is 3 because it is not smaller than 
//its neighbors 1 and 2.

import java.util.Scanner;

public class PeakElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();

        int a[] = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < a.length - 1; i++) {
            a[i] = sc.nextInt();
        }

        for (int i = 1; i < a.length; i++) {
            if (a[i - 1] < a[i] && a[i] > a[i + 1]) {
                System.out.println("Peak Element: " + a[i]);

            }
        }

        sc.close();
    }
}
