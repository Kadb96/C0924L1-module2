package bai_tap.luyen_tap_su_dung_arraylist_trong_java_collection_framework.controller;

import bai_tap.service.ProductServiceArrayList;

import java.util.Scanner;

public class ProductController {
    public static void showProductMenu() {
        Scanner scanner = new Scanner(System.in);
        ProductServiceArrayList productService = new ProductServiceArrayList();
        while (true) {
            System.out.println("----Product Menu----" + "\n" +
                    " 1. Show Products List" + "\n" +
                    " 2. Add New Product" + "\n" +
                    " 3. Delete Product" + "\n" +
                    " 4. Update Product" + "\n" +
                    " 5. Find Product" + "\n" +
                    " 6. Arrange Product" + "\n" +
                    " 7. Exit menu");
            int chose = Integer.parseInt(scanner.nextLine());
            switch (chose) {
                case 1:
                    productService.showProduct();
                    break;
                case 2:
                    productService.addProduct();
                    break;
                case 3:
                    productService.deleteProduct();
                    break;
                case 4:
                    productService.updateProduct();
                    break;
                case 5:
                    productService.findProduct();
                    break;
                case 6:
                    System.out.println(" 1. From smallest price to biggest" + "\n" +
                            " 2. From biggest price to smallest" + "\n");
                    chose = Integer.parseInt(scanner.nextLine());
                    if (chose == 1) {
                        productService.arrangeProductByPriceAsc();
                    } else if (chose == 2) {
                        productService.arrangeProductByPriceDes();
                    }
                    break;
                case 7:
                    System.out.println("exit");
                    System.exit(0);
            }
        }
    }
}