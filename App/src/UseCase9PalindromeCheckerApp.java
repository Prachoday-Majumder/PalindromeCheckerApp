import java.util.Scanner;

public class UseCase9PalindromeCheckerApp {

    // Recursive method - compares start & end characters
    static boolean isPalindrome(String str, int start, int end) {
        // Base condition: if start >= end, all characters matched
        if (start >= end) {
            return true;
        }
        // Compare characters at start and end
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }
        // Recursive call moves inward
        return isPalindrome(str, start + 1, end - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to check if it's a palindrome: ");

        if (scanner.hasNextLine()) {
            String original = scanner.nextLine();

            boolean result = isPalindrome(original, 0, original.length() - 1);

            if (result) {
                System.out.println("\"" + original + "\" is a palindrome.");
            } else {
                System.out.println("\"" + original + "\" is not a palindrome.");
            }
        }

        scanner.close();
    }
}
