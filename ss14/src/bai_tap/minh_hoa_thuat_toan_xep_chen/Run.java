package bai_tap.minh_hoa_thuat_toan_xep_chen;

import java.util.ArrayList;
import java.util.Objects;

public class Run {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(1);
        list.add(2);
        list.add(5);
        list.add(0);
        list.add(8);
        list.add(8);
        list.add(7);
        list.add(3);
        list.add(10);
        System.out.println("The list before sort" + list);
        for (int i = 1; i < list.size(); i++) {
            int temp = list.get(i);
            int tempIndex = i;
            for (int j = i - 1; j >= 0; j--) {
                if (list.get(j) > temp) {
                    list.set(j + 1, list.get(j));
                    list.set(j, temp);
                } else {
                    break;
                }
            }
        }
        System.out.println("The list after sort" + list);
    }
}