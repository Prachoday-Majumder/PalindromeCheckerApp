import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class UseCase6PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to check if it's a palindrome: ");
        
        if (scanner.hasNextLine()) {
            String original = scanner.nextLine();
            
            Queue<Character> queue = new LinkedList<>();
            Stack<Character> stack = new Stack<>();
            
            // Populate both Queue and Stack
            for (int i = 0; i < original.length(); i++) {
                char ch = original.charAt(i);
                queue.add(ch);
                stack.push(ch);
            }
            
            boolean isPalindrome = true;
            // Compare dequeue (queue) output with pop (stack) output
            while (!queue.isEmpty() && !stack.isEmpty()) {
                char fromQueue = queue.remove();
                char fromStack = stack.pop();
                
                if (fromQueue != fromStack) {
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
