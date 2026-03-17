import java.util.Scanner;
import java.util.Stack;

public class UseCase5PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to check if it's a palindrome: ");
        
        if (scanner.hasNextLine()) {
            String original = scanner.nextLine();
            
            // Stack naturally reverses the order of elements
            Stack<Character> stack = new Stack<>();
            
            // Push characters into stack
            for (int i = 0; i < original.length(); i++) {
                stack.push(original.charAt(i));
            }
            
            // Pop and compare
            boolean isPalindrome = true;
            for (int i = 0; i < original.length(); i++) {
                if (original.charAt(i) != stack.pop()) {
                    isPalindrome = false;
                    break;
                }
            }
            
            // Print result
            if (isPalindrome) {
                System.out.println("\"" + original + "\" is a palindrome.");
            } else {
                System.out.println("\"" + original + "\" is not a palindrome.");
            }
        }
        
        scanner.close();
    }
}
