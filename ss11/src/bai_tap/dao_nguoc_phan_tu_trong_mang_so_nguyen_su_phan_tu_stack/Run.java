package bai_tap.dao_nguoc_phan_tu_trong_mang_so_nguyen_su_phan_tu_stack;

import java.util.Scanner;
import java.util.Stack;

public class Run {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter array size");
        int size = Integer.parseInt(in.nextLine());
        int[] array = new int[size];
        System.out.println("Enter array elements");
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(in.nextLine());
        }
        System.out.println("---Current Array---");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println("---Array Upside Down---");
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < array.length; i++) {
            stack.push(array[i]);
        }
        for (int i = 0; i < stack.size(); i++) {
            array[i] = stack.pop();
        }
        System.out.println("---Current Array---");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
