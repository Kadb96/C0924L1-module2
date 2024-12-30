package bai_tap.cai_dat_thuat_toan_xep_chen;

import java.util.ArrayList;

public class Run {
    public static void main(String[] args) {
        int[] list = {2, 3, 4, 1, 2, 3, 4, 98, 4};
        System.out.println("The list before sort " + toString(list));
        insertionSort(list);
        System.out.println("The list after sort " + toString(list));
    }

    public static void insertionSort(int[] list) {
        for (int i = 1; i < list.length; i++) {
            int temp = list[i];
            int j = i - 1;
            while (j >= 0 && list[j] > temp) {
                list[j + 1] = list[j];
                j = j - 1;
            }
            list[j + 1] = temp;
        }
    }

    public static String toString(int[] list) {
        String string = "";
        for (int i = 0; i < list.length; i++) {
            string = string + list[i];
            if (i != list.length - 1) {
                string = string + " ,";
            }
        }
        return string;
    }
}
