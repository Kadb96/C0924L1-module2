package bai_tap.service;

import bai_tap.model.Product;

import java.util.LinkedList;
import java.util.Scanner;

public class ProductServiceLinkedList implements IProductService {
    static LinkedList<Product> productLinkedList = new LinkedList<>();

    static {
        productLinkedList.add(new Product("1", "Iphone", 10000));
        productLinkedList.add(new Product("2", "RealMi", 3000));
        productLinkedList.add(new Product("3", "Samsung", 8000));

    }

    @Override
    public void showProduct() {
        for (Product product : productLinkedList) {
            System.out.println(product);
        }
    }

    @Override
    public void addProduct() {
        Scanner scanner = new Scanner(System.in);
        String id;
        boolean isIdValid;
        do {
            isIdValid = true;
            System.out.println("Enter ID");
            id = scanner.nextLine();
            for (Product product : productLinkedList) {
                if (id.equals(product.getId())) {
                    System.out.println("id " + id + " is already added");
                    isIdValid = false;
                    break;
                }
            }
        } while (!isIdValid);
        System.out.println("Enter Name");
        String name = scanner.nextLine();
        System.out.println("Enter Price");
        float price = Float.parseFloat(scanner.nextLine());
        productLinkedList.push(new Product(id, name, price));
    }

    @Override
    public void deleteProduct() {
        Scanner scanner = new Scanner(System.in);
        String id;
        boolean isIdValid;
        isIdValid = false;
        System.out.println("Enter ID");
        id = scanner.nextLine();
        for (Product product : productLinkedList) {
            if (id.equals(product.getId())) {
                productLinkedList.remove(product);
                isIdValid = true;
                break;
            }
        }
        if (!isIdValid) {
            System.out.println("Can not found product with id " + id);
        } else {
            System.out.println("Product with id " + id + " is deleted");
        }
    }

    @Override
    public void updateProduct() {
        Scanner scanner = new Scanner(System.in);
        String id;
        boolean isIdValid;
        do {
            isIdValid = false;
            System.out.println("Enter ID");
            id = scanner.nextLine();
            for (int i = 0; i < productLinkedList.size(); i++) {
                if (id.equals(productLinkedList.get(i).getId())) {
                    isIdValid = true;
                    System.out.println("Enter product name");
                    String name = scanner.nextLine();
                    System.out.println("Enter Price");
                    float price = Float.parseFloat(scanner.nextLine());
                    productLinkedList.set(i, new Product(id, name, price));
                    break;
                }
            }
            if (!isIdValid) {
                System.out.println("Can not found product with id " + id);
            } else {
                System.out.println("Product with id " + id + " is updated");
            }
        } while (!isIdValid);
    }

    @Override
    public void findProduct() {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        boolean isFind = false;
        for (Product product : productLinkedList) {
            if (name.equals(product.getName())) {
                System.out.println(product);
                isFind = true;
                break;
            }
        }
        if (!isFind) {
            System.out.println("Can not found product with name " + name);
        }
    }

    @Override
    public void arrangeProductByPriceAsc() {
        productLinkedList.sort(null);
        this.showProduct();
    }

    @Override
    public void arrangeProductByPriceDes() {
        productLinkedList.sort(null);
        for (int i = 0; i < productLinkedList.size(); i++) {
            System.out.println(productLinkedList.get(productLinkedList.size() - 1 - i));
        }
    }
}
