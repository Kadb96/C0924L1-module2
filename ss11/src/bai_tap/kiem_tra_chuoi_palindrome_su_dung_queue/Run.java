package bai_tap.kiem_tra_chuoi_palindrome_su_dung_queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Run {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter text");
        String text = in.nextLine();
        Queue<String> queue = new LinkedList<String>();
        for (int i = 0; i < text.length(); i++) {
            queue.offer(text.charAt(i) + "");
        }
        Stack<String> stack = new Stack<>();
        for (int i = 0; i < text.length(); i++) {
            stack.push(text.charAt(i) + "");
        }
        boolean isPalindrome = true;
        String tempStack;
        String tempQueue;
        while (!stack.empty()) {
            tempStack = stack.pop();
            tempQueue = queue.remove();
            if (!tempStack.equals(tempQueue)) {
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome) {
            System.out.println("The text '" + text + "' is palindrome");
        } else {
            System.out.println("The text '" + text + "' is not palindrome");
        }
    }
}
