package bai_tap.quan_ly_khach_hang_crud.service;

import bai_tap.quan_ly_khach_hang_crud.model.Customer;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class CustomerService implements ICustomerService {
    private static final String CUSTOMER_DATA = "C:\\Users\\ASUS\\Desktop\\codegym\\module2\\ss16\\src\\bai_tap\\quan_ly_khach_hang_crud\\data\\customer_data.csv";
    static File customerData = new File(CUSTOMER_DATA);

    @Override
    public void showCustomer() {
        try {
            FileReader fileReader = new FileReader(customerData);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = "";
            ArrayList<Customer> customers = new ArrayList<>();
            do {
                line = bufferedReader.readLine();
                if (line != null) {
                    int id = Integer.parseInt(line.split(",")[0]);
                    String name = line.split(",")[1];
                    String dateOfBirth = line.split(",")[2];
                    String address = line.split(",")[3];
                    customers.add(new Customer(id, name, dateOfBirth, address));
                }
            } while (line != null);
            fileReader.close();
            for (Customer customer : customers) {
                System.out.println(customer.toString());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public boolean addCustomer() {
        Scanner scanner = new Scanner(System.in);
        try {
            FileReader fileReader = new FileReader(customerData);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = "";
            ArrayList<Customer> customers = new ArrayList<>();
            do {
                line = bufferedReader.readLine();
                if (line != null) {
                    int id = Integer.parseInt(line.split(",")[0]);
                    String name = line.split(",")[1];
                    String dateOfBirth = line.split(",")[2];
                    String address = line.split(",")[3];
                    customers.add(new Customer(id, name, dateOfBirth, address));
                }
            } while (line != null);
            fileReader.close();

            System.out.println("Enter the id of the customer you want to add:");
            int id = Integer.parseInt(scanner.nextLine());

            for (Customer customer : customers) {
                if (id == customer.getId()) {
                    return false;
                }
            }
            System.out.println("Enter the name of the customer you want to add:");
            String name = scanner.nextLine();
            System.out.println("Enter the date of birth of the customer you want to add:");
            String dateOfBirth = scanner.nextLine();
            System.out.println("Enter the address of the customer you want to add:");
            String address = scanner.nextLine();
            customers.add(new Customer(id, name, dateOfBirth, address));

            FileWriter fileWriter = new FileWriter(customerData, false);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            boolean first = true;
            for (Customer customer : customers) {
                if (!first) {
                    bufferedWriter.newLine();
                }
                bufferedWriter.write(customer.getId() + "," + customer.getName() + "," + customer.getDateOfBirth() + "," + customer.getAddress());
                first = false;
            }
            bufferedWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return true;
    }

    @Override
    public boolean deleteCustomer() {
        Scanner scanner = new Scanner(System.in);
        try {
            FileReader fileReader = new FileReader(customerData);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = "";
            ArrayList<Customer> customers = new ArrayList<>();
            do {
                line = bufferedReader.readLine();
                if (line != null) {
                    int id = Integer.parseInt(line.split(",")[0]);
                    String name = line.split(",")[1];
                    String dateOfBirth = line.split(",")[2];
                    String address = line.split(",")[3];
                    customers.add(new Customer(id, name, dateOfBirth, address));
                }
            } while (line != null);
            fileReader.close();

            System.out.println("Enter the id of the customer you want to add:");
            int id = Integer.parseInt(scanner.nextLine());
            boolean isFound = false;
            for (int i = 0; i < customers.size(); i++) {
                if (id == customers.get(i).getId()) {
                    customers.remove(i);
                    isFound = true;
                    break;
                }
            }
            if (!isFound) {
                return false;
            }

            FileWriter fileWriter = new FileWriter(customerData, false);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            boolean first = true;
            for (Customer customer : customers) {
                if (!first) {
                    bufferedWriter.newLine();
                }
                bufferedWriter.write(customer.getId() + "," + customer.getName() + "," + customer.getDateOfBirth() + "," + customer.getAddress());
                first = false;
            }
            bufferedWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return true;
    }

    @Override
    public boolean updateCustomer() {
        Scanner scanner = new Scanner(System.in);
        try {
            FileReader fileReader = new FileReader(customerData);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = "";
            ArrayList<Customer> customers = new ArrayList<>();
            do {
                line = bufferedReader.readLine();
                if (line != null) {
                    int id = Integer.parseInt(line.split(",")[0]);
                    String name = line.split(",")[1];
                    String dateOfBirth = line.split(",")[2];
                    String address = line.split(",")[3];
                    customers.add(new Customer(id, name, dateOfBirth, address));
                }
            } while (line != null);
            fileReader.close();

            System.out.println("Enter the id of the customer you want to update:");
            int id = Integer.parseInt(scanner.nextLine());
            boolean isFound = false;
            for (int i = 0; i < customers.size(); i++) {
                if (id == customers.get(i).getId()) {
                    System.out.println("Enter the name of the customer you want to update:");
                    customers.get(i).setName(scanner.nextLine());
                    System.out.println("Enter the date of birth of the customer you want to update:");
                    customers.get(i).setDateOfBirth(scanner.nextLine());
                    System.out.println("Enter the address of the customer you want to update:");
                    customers.get(i).setAddress(scanner.nextLine());
                    isFound = true;
                    break;
                }
            }
            if (!isFound) {
                return false;
            }

            FileWriter fileWriter = new FileWriter(customerData, false);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            boolean first = true;
            for (Customer customer : customers) {
                if (!first) {
                    bufferedWriter.newLine();
                }
                bufferedWriter.write(customer.getId() + "," + customer.getName() + "," + customer.getDateOfBirth() + "," + customer.getAddress());
                first = false;
            }
            bufferedWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return true;
    }
}

