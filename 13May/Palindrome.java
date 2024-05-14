package TASKS;

public class Palindrome {
    public static boolean isPalindrome(String str) {
        StringBuilder sb = new StringBuilder(str);
        return str.equals(sb.reverse().toString());
    }

    public static void main(String[] args) {
        String str = "madam";
        if (isPalindrome(str)) {
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println(str + " is not a palindrome.");
        }
    }
}
