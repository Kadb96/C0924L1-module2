package service;

import model.OTo;

import java.util.ArrayList;
import java.util.List;

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
