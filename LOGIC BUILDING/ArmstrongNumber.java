package TASKS;

public class ArmstrongNumber {
    public static void main(String[] args) {
        int num = 153;
        System.out.println(isArmstrong(num));
    }

    public static boolean isArmstrong(int num) {
        int originalNum = num;
        int digits = countDigits(num);
        int sum = calculateSum(num, digits);
        return sum == originalNum;
    }

    private static int countDigits(int num) {
        if (num < 10) {
            return 1;
        }
        return 1 + countDigits(num / 10);
    }

    private static int calculateSum(int num, int digits) {
        if (num == 0) {
            return 0;
        }
        int digit = num % 10;
        return (int) Math.pow(digit, digits) + calculateSum(num / 10, digits);
    }
}