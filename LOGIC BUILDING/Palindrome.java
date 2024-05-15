package TASKS;

public class Palindrome {
    public static boolean isPalindrome(String str) {
        if (str.length() <= 1) {
            return true; // Base case: A string of length 0 or 1 is a palindrome
        } else {
            // Check if the first and last characters match
            if (str.charAt(0) != str.charAt(str.length() - 1)) {
                return false; // If they don't match, it's not a palindrome
            } else {
                // Recursive call with the substring excluding the first and last characters
                return isPalindrome(str.substring(1, str.length() - 1));
            }
        }
    }

    public static void main(String[] args) {
        String str1 = "madam";
        String str2 = "hello";

        System.out.println(str1 + " is a palindrome: " + isPalindrome(str1));
        System.out.println(str2 + " is a palindrome: " + isPalindrome(str2));
    }
}