package service;

import model.XeMay;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class XeMayService implements IXeService {
    @Override
    public void showXe() {
        List<XeMay> productList = new ArrayList<XeMay>();
        productList = WriteAndReadProductFile.readFileXeMay();
        for (XeMay product : productList) {
            System.out.println(product);
        }
    }

    @Override
    public boolean addXe() {
        Scanner scanner = new Scanner(System.in);
        List<XeMay> xeMayList = new ArrayList<XeMay>();
        xeMayList = WriteAndReadProductFile.readFileXeMay();
        try {
            System.out.println("Biển kiểm soát cần thêm mới:");
            String bienKiemSoat = scanner.nextLine();
            System.out.println("Hãng sản xuất cần thêm mới:");
            String hangSanXuat = scanner.nextLine();
            System.out.println("Năm sản xuất cần thêm mới:");
            int namSanXuat = Integer.parseInt(scanner.nextLine());
            System.out.println("Chủ sở hữu cần thêm mới:");
            String chuSoHuu = scanner.nextLine();
            System.out.println("Công suất cần thêm mới:");
            float congSuat = Float.parseFloat(scanner.nextLine());
            xeMayList.add(new XeMay(bienKiemSoat, hangSanXuat, namSanXuat, chuSoHuu, congSuat));
            WriteAndReadProductFile.writeFileXeMay(xeMayList);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return true;
    }

    @Override
    public boolean deleteXe() {
        Scanner scanner = new Scanner(System.in);
        List<XeMay> xeMayList = new ArrayList<XeMay>();
        xeMayList = WriteAndReadProductFile.readFileXeMay();
        try {
            System.out.println("Biển kiểm soát xóa:");
            String bienKiemSoat = scanner.nextLine();
            for (int i = 0; i < xeMayList.size(); i++) {
                if (bienKiemSoat.equals(xeMayList.get(i).getBienKiemSoat())) {
                    System.out.println("   Xác nhận xoá phương tiện " + bienKiemSoat + ":" + "\n" +
                            "   1. Yes" + "\n" +
                            "   2. No");
                    int choose = Integer.parseInt(scanner.nextLine());
                    if (choose == 1) {
                        xeMayList.remove(i);
                        WriteAndReadProductFile.writeFileXeMay(xeMayList);
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
