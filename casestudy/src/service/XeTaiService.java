package service;

import model.XeTai;

import java.util.ArrayList;
import java.util.List;

public class XeTaiService implements IXeService {
    @Override
    public void showXe() {
        List<XeTai> productList = new ArrayList<XeTai>();
        productList = WriteAndReadProductFile.readFileXeTai();
        for (XeTai product : productList) {
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
