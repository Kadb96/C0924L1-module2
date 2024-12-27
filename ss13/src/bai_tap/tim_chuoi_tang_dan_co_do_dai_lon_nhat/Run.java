package bai_tap.tim_chuoi_tang_dan_co_do_dai_lon_nhat;

import java.util.ArrayList;
import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = in.nextLine();
        int maxLength = 1;
        int crrLength;
        int startSubStr = 0;
        for (int i = 0; i < str.length() - 1;) {
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(j) > str.charAt(j - 1)) {
                    crrLength = j - i + 1;
                    if (crrLength > maxLength) {
                        maxLength = crrLength;
                        startSubStr = i;
                    }
                    if (j == str.length() - 1) {
                        i = j;
                    }
                } else {
                    i = j;
                    break;
                }
            }
        }
        System.out.println(str.substring(startSubStr, startSubStr + maxLength));
    }
}
