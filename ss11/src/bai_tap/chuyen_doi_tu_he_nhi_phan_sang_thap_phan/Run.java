package bai_tap.chuyen_doi_tu_he_nhi_phan_sang_thap_phan;

import java.util.Scanner;
import java.util.Stack;

public class Run {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = Integer.parseInt(in.nextLine());
        int sub = number;
        Stack<Integer> stack = new Stack<>();
        while (sub > 0) {
            stack.push(sub % 2);
            sub /= 2;
        }
        int binaryNumber = 0;
        while (!stack.empty()) {
            binaryNumber = binaryNumber * 10 + stack.pop();
        }
        System.out.println("The binary number of " + number + " is " + binaryNumber);
    }
}
