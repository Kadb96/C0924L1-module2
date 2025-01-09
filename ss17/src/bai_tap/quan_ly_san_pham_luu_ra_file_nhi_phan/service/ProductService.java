package bai_tap.quan_ly_san_pham_luu_ra_file_nhi_phan.service;

import bai_tap.quan_ly_san_pham_luu_ra_file_nhi_phan.model.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductService implements IProductService {

    @Override
    public void showProduct() {
        List<Product> productList = new ArrayList<Product>();
        productList = WriteAndReadProductFile.readFile();
        for (Product product : productList) {
            System.out.println(product);
        }
    }

    @Override
    public boolean addProduct() {
        List<Product> productList = new ArrayList<Product>();
        productList = WriteAndReadProductFile.readFile();
        Scanner scanner = new Scanner(System.in);
        int id;
        try {
            System.out.println("Enter new product id:");
            id = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Invalid number");
            return false;
        }
        for (Product product : productList) {
            if (id == product.getProductID()) {
                System.out.println("Product with ID " + id + " already exists");
                return false;
            }
        }
        System.out.println("Enter new product name:");
        String name = scanner.nextLine();
        System.out.println("Enter new product price:");
        String price = scanner.nextLine();
        System.out.println("Enter new product factory:");
        String category = scanner.nextLine();
        System.out.println("Enter new product description:");
        String description = scanner.nextLine();
        productList.add(new Product(id, name, price, category, description));
        try {
            WriteAndReadProductFile.writeFile(productList);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return true;
    }

    @Override
    public boolean deleteProduct() {
        List<Product> productList = new ArrayList<Product>();
        productList = WriteAndReadProductFile.readFile();
        Scanner scanner = new Scanner(System.in);
        int id;
        try {
            System.out.println("Enter product id need to be deleted:");
            id = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Invalid number");
            return false;
        }
        for (int i = 0; i < productList.size(); i++) {
            if (id == productList.get(i).getProductID()) {
                productList.remove(i);
                try {
                    WriteAndReadProductFile.writeFile(productList);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                return true;
            }
        }
        System.out.println("Product with ID " + id + " not found");
        return false;
    }

    @Override
    public boolean updateProduct() {
        List<Product> productList = new ArrayList<Product>();
        productList = WriteAndReadProductFile.readFile();
        Scanner scanner = new Scanner(System.in);
        int id;
        try {
            System.out.println("Enter product id need to be updated:");
            id = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Invalid number");
            return false;
        }
        for (int i = 0; i < productList.size(); i++) {
            if (id == productList.get(i).getProductID()) {
                System.out.println("Enter new product name:");
                String name = scanner.nextLine();
                System.out.println("Enter new product price:");
                String price = scanner.nextLine();
                System.out.println("Enter new product factory:");
                String category = scanner.nextLine();
                System.out.println("Enter new product description:");
                String description = scanner.nextLine();
                productList.set(i, new Product(id, name, price, category, description));
                try {
                    WriteAndReadProductFile.writeFile(productList);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                return true;
            }
        }
        System.out.println("Product with ID " + id + " not found");
        return false;

    }
}
