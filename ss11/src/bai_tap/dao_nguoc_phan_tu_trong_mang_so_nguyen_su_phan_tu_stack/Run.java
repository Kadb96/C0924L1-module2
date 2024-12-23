package bai_tap.dao_nguoc_phan_tu_trong_mang_so_nguyen_su_phan_tu_stack;

import java.util.Scanner;
import java.util.Stack;

public class Run {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        System.out.println("Enter stack size");
        int size = Integer.parseInt(in.nextLine());
        System.out.println("Enter stack elements");
        for (int i = 0; i < size; i++) {
            stack.push(Integer.parseInt(in.nextLine()));
        }
        System.out.println("Current stack: " + stack);
        System.out.println("Stack upside down");
        Stack<Integer> subStack = new Stack<>();
        for (int i = 0; i < size; i++) {
            subStack.push(stack.pop());
        }
        stack = subStack;
        System.out.println("Current stack: " + stack);
    }
}
