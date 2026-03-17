import java.util.Scanner;

public class UseCase3PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to check if it's a palindrome: ");
        
        if (scanner.hasNextLine()) {
            String original = scanner.nextLine();
            
            // Reversing the string using a loop
            String reversed = "";
            for (int i = original.length() - 1; i >= 0; i--) {
                // String Concatenation (+) – Used to build the reversed string character by character (introduces String Immutability concepts)
                reversed += original.charAt(i);
            }
            
            // Compare original and reversed using the equals() Method
            if (original.equals(reversed)) {
                System.out.println("\"" + original + "\" is a palindrome.");
            } else {
                System.out.println("\"" + original + "\" is not a palindrome.");
            }
        }
        
        scanner.close();
    }
}
