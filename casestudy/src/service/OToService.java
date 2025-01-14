package service;

import model.OTo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OToService implements IXeService {
    @Override
    public void showXe() {
        List<OTo> productList = new ArrayList<OTo>();
        productList = WriteAndReadProductFile.readFileOTo();
        for (OTo product : productList) {
            System.out.println(product);
        }
    }

    @Override
    public boolean addXe() {
        Scanner scanner = new Scanner(System.in);
        List<OTo> oToList = new ArrayList<OTo>();
        oToList = WriteAndReadProductFile.readFileOTo();
        try {
            System.out.println("Biển kiểm soát cần thêm mới:");
            String bienKiemSoat = scanner.nextLine();
            System.out.println("Hãng sản xuất cần thêm mới:");
            String hangSanXuat = scanner.nextLine();
            System.out.println("Năm sản xuất cần thêm mới:");
            int namSanXuat = Integer.parseInt(scanner.nextLine());
            System.out.println("Chủ sở hữu cần thêm mới:");
            String chuSoHuu = scanner.nextLine();
            System.out.println("Số chỗ ngồi cần thêm mới:");
            int soChoNgoi = Integer.parseInt(scanner.nextLine());
            System.out.println("Kiểu xe cần thêm mới:");
            String kieuXe = scanner.nextLine();
            oToList.add(new OTo(bienKiemSoat, hangSanXuat, namSanXuat, chuSoHuu, soChoNgoi, kieuXe));
            WriteAndReadProductFile.writeFileOTo(oToList);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return true;
    }

    @Override
    public boolean deleteXe() {
        Scanner scanner = new Scanner(System.in);
        List<OTo> oToList = new ArrayList<OTo>();
        oToList = WriteAndReadProductFile.readFileOTo();
        try {
            System.out.println("Biển kiểm soát xóa:");
            String bienKiemSoat = scanner.nextLine();
            for (int i = 0; i < oToList.size(); i++) {
                if (bienKiemSoat.equals(oToList.get(i).getBienKiemSoat())) {
                    System.out.println("   Xác nhận xoá phương tiện " + bienKiemSoat + ":" + "\n" +
                            "   1. Yes" + "\n" +
                            "   2. No");
                    int choose = Integer.parseInt(scanner.nextLine());
                    if (choose == 1) {
                        oToList.remove(i);
                        WriteAndReadProductFile.writeFileOTo(oToList);
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
