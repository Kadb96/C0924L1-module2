package bai_tap;

public class HienThi20SoNguyenDauTien {
    public static void main(String[] args) {
        int numb = 2;
        int count = 0;
        boolean flag = true;
        while (count <= 20) {
            flag = true;
            for (int i = 2; i < numb; i++) {
                if (numb % i == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println(numb);
                count++;
            }
            numb++;
        }
    }
}
