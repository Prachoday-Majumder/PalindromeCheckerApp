import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class UseCase7PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to check if it's a palindrome: ");
        
        if (scanner.hasNextLine()) {
            String original = scanner.nextLine();
            
            // Deque (Double Ended Queue) – A data structure that allows insertion and deletion from both ends
            Deque<Character> deque = new ArrayDeque<>();
            
            // Insert characters into deque
            for (int i = 0; i < original.length(); i++) {
                deque.addLast(original.charAt(i));
            }
            
            boolean isPalindrome = true;
            
            // Remove first & last and compared until empty (or 1 element left)
            while (deque.size() > 1) {
                char first = deque.removeFirst();
                char last = deque.removeLast();
                
                if (first != last) {
                    isPalindrome = false;
                    break;
                }
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
