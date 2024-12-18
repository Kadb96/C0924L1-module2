package bai_tap.quan_ly_khach_hang_crud_arrayList.service;

import bai_tap.quan_ly_khach_hang_crud_arrayList.model.Customer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CustomerService implements ICustomerService {
    static List<Customer> customers = new ArrayList<>();

    static {
        customers.add(new Customer("1", "Vu", "09/06", "An Trach"));
        customers.add(new Customer("2", "Em Trang", "09/11", "Khuong Dinh"));
        customers.add(new Customer("3", "Loc Toc", "20/02", "My Dinh"));
    }

    @Override
    public void showCustomer() {
        for (Customer customer : customers) {
            System.out.println(customer);
        }
    }

    @Override
    public void addCustomer() {
        Scanner scanner = new Scanner(System.in);
        String id;
        boolean isIdValid;
        do {
            isIdValid = true;
            System.out.println("Enter ID");
            id = scanner.nextLine();
            for (Customer customer : customers) {
                if (id.equals(customer.getId())) {
                    System.out.println("id " + id + " is already added");
                    isIdValid = false;
                    break;
                }
            }
        } while (!isIdValid);
        System.out.println("Enter Name");
        String name = scanner.nextLine();
        System.out.println("Enter Date of Birth");
        String dateOfBirth = scanner.nextLine();
        System.out.println("Enter Address");
        String address = scanner.nextLine();
        customers.add(new Customer(id, name, dateOfBirth, address));
    }

    @Override
    public void deleteCustomer() {
        Scanner scanner = new Scanner(System.in);
        String id;
        boolean isIdValid;
        do {
            isIdValid = false;
            System.out.println("Enter ID");
            id = scanner.nextLine();
            for (int i = 0; i < customers.size(); i++) {
                if (id.equals(customers.get(i).getId())) {
                    isIdValid = true;
                    customers.remove(i);
                    break;
                }
            }
            System.out.println("Can not found customer with id " + id);
        } while (!isIdValid);
    }

    @Override
    public void updateCustomer() {
        Scanner scanner = new Scanner(System.in);
        String id;
        boolean isIdValid;
        do {
            isIdValid = false;
            System.out.println("Enter ID");
            id = scanner.nextLine();
            for (int i = 0; i < customers.size(); i++) {
                if (id.equals(customers.get(i).getId())) {
                    isIdValid = true;
                    System.out.println("Enter customer name");
                    String name = scanner.nextLine();
                    System.out.println("Enter Date of Birth");
                    String dateOfBirth = scanner.nextLine();
                    System.out.println("Enter Address");
                    String address = scanner.nextLine();
                    customers.set(i,new Customer(id, name, dateOfBirth, address));
                    break;
                }
            }
            System.out.println("Can not found customer with id " + id);
        } while (!isIdValid);
    }
}

