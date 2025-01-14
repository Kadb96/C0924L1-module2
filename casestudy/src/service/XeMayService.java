package service;

import model.XeMay;

import java.util.ArrayList;
import java.util.List;

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
        return false;
    }

    @Override
    public boolean deleteXe() {
        return false;
    }

    @Override
    public boolean updateXe() {
        return false;
    }
}
