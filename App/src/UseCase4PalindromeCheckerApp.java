import java.util.Scanner;

public class UseCase4PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to check if it's a palindrome: ");
        
        if (scanner.hasNextLine()) {
            String original = scanner.nextLine();
            
            // Convert string to character array
            char[] charArray = original.toCharArray();
            
            // Use two-pointer approach to compare start & end characters
            int left = 0;
            int right = charArray.length - 1;
            boolean isPalindrome = true;
            
            while (left < right) {
                if (charArray[left] != charArray[right]) {
                    isPalindrome = false;
                    break;
                }
                left++;
                right--;
            }
            
            if (isPalindrome) {
                System.out.println("\"" + original + "\" is a palindrome.");
            } else {
                System.out.println("\"" + original + "\" is not a palindrome.");
            }
        }
        
        scanner.close();
    }
}
