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
                    customerService.addCustomer();
                    break;
                case 3:
                    customerService.deleteCustomer();
                    break;
                case 4:
                    customerService.updateCustomer();
                    break;
                case 5:
                    System.out.println("exit");
                    System.exit(0);
            }
        }
    }
}
