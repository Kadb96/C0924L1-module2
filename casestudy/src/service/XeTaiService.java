package service;

import model.XeTai;
import util.WriteAndReadFile;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class XeTaiService implements IXeService {
    @Override
    public void showXe() {
        List<XeTai> productList = new ArrayList<XeTai>();
        productList = WriteAndReadFile.readFileXeTai();
        for (XeTai product : productList) {
            System.out.println(product);
        }
    }

    @Override
    public boolean addXe() {
        Scanner scanner = new Scanner(System.in);
        List<XeTai> xeTaiList = new ArrayList<XeTai>();
        xeTaiList = WriteAndReadFile.readFileXeTai();
        try {
            System.out.println("Biển kiểm soát cần thêm mới:");
            String bienKiemSoat = scanner.nextLine();
            System.out.println("Hãng sản xuất cần thêm mới:");
            String hangSanXuat = scanner.nextLine();
            System.out.println("Năm sản xuất cần thêm mới:");
            int namSanXuat = Integer.parseInt(scanner.nextLine());
            System.out.println("Chủ sở hữu cần thêm mới:");
            String chuSoHuu = scanner.nextLine();
            System.out.println("Tải trọng cần thêm mới:");
            float taiTrong = Float.parseFloat(scanner.nextLine());
            xeTaiList.add(new XeTai(bienKiemSoat, hangSanXuat, namSanXuat, chuSoHuu, taiTrong));
            WriteAndReadFile.writeFileXeTai(xeTaiList);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return true;
    }

    @Override
    public boolean deleteXe() {
        Scanner scanner = new Scanner(System.in);
        List<XeTai> xeTaiList = new ArrayList<XeTai>();
        xeTaiList = WriteAndReadFile.readFileXeTai();
        try {
            System.out.println("Biển kiểm soát xóa:");
            String bienKiemSoat = scanner.nextLine();
            for (int i = 0; i < xeTaiList.size(); i++) {
                if (bienKiemSoat.equals(xeTaiList.get(i).getBienKiemSoat())) {
                    System.out.println("   Xác nhận xoá phương tiện " + bienKiemSoat + ":" + "\n" +
                            "   1. Yes" + "\n" +
                            "   2. No");
                    int choose = Integer.parseInt(scanner.nextLine());
                    if (choose == 1) {
                        xeTaiList.remove(i);
                        WriteAndReadFile.writeFileXeTai(xeTaiList);
                    } else {
                        return false;
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return true;
    }
}
