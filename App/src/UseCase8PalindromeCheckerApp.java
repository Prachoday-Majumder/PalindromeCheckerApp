import java.util.Scanner;

public class UseCase8PalindromeCheckerApp {

    // Node class for singly linked list
    static class Node {
        char data;
        Node next;

        Node(char data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to check if it's a palindrome: ");

        if (scanner.hasNextLine()) {
            String original = scanner.nextLine();

            // Convert string to linked list
            Node head = null;
            Node tail = null;
            for (int i = 0; i < original.length(); i++) {
                Node newNode = new Node(original.charAt(i));
                if (head == null) {
                    head = newNode;
                    tail = newNode;
                } else {
                    tail.next = newNode;
                    tail = newNode;
                }
            }

            // Find the middle using Fast and Slow Pointer Technique
            Node slow = head;
            Node fast = head;
            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }

            // Reverse the second half in-place
            Node prev = null;
            Node current = slow;
            while (current != null) {
                Node nextNode = current.next;
                current.next = prev;
                prev = current;
                current = nextNode;
            }

            // Compare the first half (from head) with the reversed second half (from prev)
            Node left = head;
            Node right = prev;
            boolean isPalindrome = true;
            while (right != null) {
                if (left.data != right.data) {
                    isPalindrome = false;
                    break;
                }
                left = left.next;
                right = right.next;
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
