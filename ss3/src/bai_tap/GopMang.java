package bai_tap;

import java.util.Scanner;

public class GopMang {
    public static void printArray(int[] arr) {
        System.out.println("----Array----");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
        System.out.println("-------------");
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("----INPUT FIRST ARRAY----");
        int[] firstArray = new int[10];
        for (int i = 0; i < firstArray.length; i++) {
            firstArray[i] = Integer.parseInt(in.nextLine());
        }
        printArray(firstArray);
        System.out.println("----INPUT SECOND ARRAY----");
        int[] secondArray = new int[10];
        for (int i = 0; i < secondArray.length; i++) {
            secondArray[i] = Integer.parseInt(in.nextLine());
        }
        printArray(secondArray);
        System.out.println("----MERGE ARRAY----");
        int[] mergedArray = new int[firstArray.length + secondArray.length];
        for (int i = 0; i < firstArray.length; i++) {
            mergedArray[i] = firstArray[i];
        }
        for (int i = 0; i < secondArray.length; i++) {
            mergedArray[i + firstArray.length] = secondArray[i];
        }
        printArray(mergedArray);
    }
}
