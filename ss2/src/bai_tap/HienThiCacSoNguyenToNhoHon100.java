package bai_tap;

public class HienThiCacSoNguyenToNhoHon100 {
    public static void main(String[] args) {
        int numb = 2;
        boolean flag = true;
        while (numb < 100) {
            flag = true;
            for (int i = 2; i < numb; i++) {
                if (numb % i == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println(numb);
            }
            numb++;
        }
    }
}
