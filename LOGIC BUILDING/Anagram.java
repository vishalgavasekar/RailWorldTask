package TASKS;

public class Anagram {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";

        boolean areAnagrams = checkAnagram(str1, str2);
        if (areAnagrams) {
            System.out.println("are anagrams");
        } else {
            System.out.println("are not anagrams");
        }
    }

    public static boolean checkAnagram(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        for (int i = 0; i < str1.length(); i++) {
            char c = str1.charAt(i);
            int index = str2.indexOf(c);
            if (index == -1) {
                return false;
            }
            str2 = str2.substring(0, index) + str2.substring(index + 1);
        }

        return str2.isEmpty();
    }
}
