package bai_tap.quan_ly_san_pham_luu_ra_file_nhi_phan.controller;

import bai_tap.quan_ly_san_pham_luu_ra_file_nhi_phan.service.ProductService;

import java.util.Scanner;

public class ProductController {
    public static void showProductMenu() {
        Scanner scanner = new Scanner(System.in);
        ProductService productService = new ProductService();
        while (true) {
            System.out.println("----Customer Menu----" + "\n" +
                    " 1. Show Products List" + "\n" +
                    " 2. Add New Product" + "\n" +
                    " 3. Delete Product" + "\n" +
                    " 4. Update Product" + "\n" +
                    " 5. Exit menu");
            int chose = Integer.parseInt(scanner.nextLine());
            switch (chose) {
                case 1:
                    productService.showProduct();
                    break;
                case 2:
                    if (!productService.addProduct()) {
                        System.out.println("Add new product failed");
                    } else {
                        System.out.println("Add new product success");
                    }
                    break;
                case 3:
                    if (!productService.deleteProduct()) {
                        System.out.println("ID does not exist");
                    } else {
                        System.out.println("Delete product success");
                    }
                    break;
                case 4:
                    if (!productService.updateProduct()) {
                        System.out.println("ID does not exist");
                    } else {
                        System.out.println("Update product success");
                    }
                    break;
                case 5:
                    System.out.println("exit");
                    System.exit(0);
            }
        }
    }
}
