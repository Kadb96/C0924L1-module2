package bai_tap.quan_ly_khach_hang_crud.controller;

import bai_tap.quan_ly_khach_hang_crud.service.CustomerService;

import java.util.Scanner;

public class CustomerController {
    public static void showCustomerMenu() {
        Scanner scanner = new Scanner(System.in);
        CustomerService customerService = new CustomerService();
        while (true) {
            System.out.println("----Customer Menu----" + "\n" +
                    " 1. Show Customers List" + "\n" +
                    " 2. Add New Customer" + "\n" +
                    " 3. Delete Customer" + "\n" +
                    " 4. Update Customer" + "\n" +
                    " 5. Exit menu");
            int chose = Integer.parseInt(scanner.nextLine());
            switch (chose) {
                case 1:
                    customerService.showCustomer();
                    break;
                case 2:
                    if (!customerService.addCustomer()) {
                        System.out.println("ID already exist");
                    }
                    break;
                case 3:
                    if (!customerService.deleteCustomer()) {
                        System.out.println("ID does not exist");
                    }
                    break;
                case 4:
                    if (!customerService.updateCustomer()) {
                        System.out.println("ID does not exist");
                    }
                    break;
                case 5:
                    System.out.println("exit");
                    System.exit(0);
            }
        }
    }
}
