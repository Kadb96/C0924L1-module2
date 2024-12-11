package baitap;

import java.util.Scanner;

public class XoaPhanTuKhoiMang {
    public static void printArray(int[] arr) {
        System.out.println("----Array----");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
        System.out.println("-------------");
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] numbArray = {10, 4, 6, 7, 8, 6, 0, 0, 0, 0};
        printArray(numbArray);
        System.out.println("Enter the number need to be deleted:");
        int deleteNumb = Integer.parseInt(in.nextLine());
        boolean isFound = false;
        for (int i = 0; i < numbArray.length; i++) {
            if (isFound) {
                if (i == numbArray.length - 1) {
                    numbArray[i] = 0;
                } else {
                    numbArray[i] = numbArray[i + 1];
                }
            } else if (deleteNumb != numbArray[i]) {
                continue;
            } else {
                isFound = true;
                if (i == numbArray.length - 1) {
                    numbArray[i] = 0;
                } else {
                    numbArray[i] = numbArray[i + 1];
                }
            }
        }
        printArray(numbArray);
    }
}

