package bai_tap;

import java.util.Scanner;

public class ThemPhanTuVaoMang {
    public static void printArray(int[] arr) {
        System.out.println("----Array----");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
        System.out.println("-------------");
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] numbArray = {10, 4, 6, 7, 8, 0, 0, 0, 0, 0};
        printArray(numbArray);
        System.out.println("Input the number need to be inserted:");
        int insertedNumb = Integer.parseInt(in.nextLine());
        System.out.println("Input the index of the number need to be inserted:");
        int insertedIndex = Integer.parseInt(in.nextLine());
        if (insertedIndex <= -1 && insertedIndex >= numbArray.length - 1) {
            System.out.println("Cannot insert index " + insertedIndex + " into the array");
        }
        for (int i = numbArray.length -1; i > insertedIndex; i--) {
            numbArray[i] = numbArray[i - 1];
        }
        numbArray[insertedIndex] = insertedNumb;
        printArray(numbArray);
    }
}
