package bai_tap.quan_ly_san_pham_luu_ra_file_nhi_phan.service;

import bai_tap.quan_ly_san_pham_luu_ra_file_nhi_phan.model.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class WriteAndReadProductFile {
    private static final String FILE_PATH = "ss17/src/bai_tap/quan_ly_san_pham_luu_ra_file_nhi_phan/data/product_data_file.dat";

    public static List<Product> readFile() {
        File file = new File(FILE_PATH);
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        List<Product> productList = new ArrayList<Product>();
        try {
            fis = new FileInputStream(file);
            ois = new ObjectInputStream(fis);
            productList = (List<Product>) ois.readObject();
            ois.close();
        } catch (EOFException e) {
            productList = new ArrayList<Product>();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return productList;
    }

    public static void writeFile(List<Product> productList) throws IOException {
        File file = new File(FILE_PATH);
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        fos = new FileOutputStream(file, false);
        oos = new ObjectOutputStream(fos);
        oos.writeObject(productList);
    }
}
