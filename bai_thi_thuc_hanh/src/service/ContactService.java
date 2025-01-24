package service;

import model.Contact;
import util.WriteAndReadFile;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ContactService implements IContactService {
    @Override
    public void showContact() {
        List<Contact> contactList = new ArrayList<Contact>();
        contactList = WriteAndReadFile.readFile();
        Scanner scanner = new Scanner(System.in);
        String choose;

        for (int j = 0; j < contactList.size() / 5 + 1; j++) {
            System.out.println("---Xem danh sách---");
            for (int i = j * 5; (i < (j + 1) * 5) && i < contactList.size(); i++) {
                System.out.println(contactList.get(i));
            }
            System.out.println("   1. Thêm mới (chọn 1 để thêm mới)" + "\n" +
                    "   2. Xem tiếp (chọn phím khác để xem tiếp)");
            choose = scanner.nextLine();
            if (choose.equals("1")) {
                addContact();
                break;
            }
        }
    }

    @Override
    public boolean addContact() {
        Scanner scanner = new Scanner(System.in);
        List<Contact> contactList = new ArrayList<Contact>();
        contactList = WriteAndReadFile.readFile();
        try {
            System.out.println("Nhập số điện thoại:");
            String phoneNumber = scanner.nextLine();
            System.out.println("Nhập nhóm:");
            String group = scanner.nextLine();
            System.out.println("Nhập tên:");
            String name = scanner.nextLine();
            System.out.println("Nhập giới tính:");
            String gender = scanner.nextLine();
            System.out.println("Nhập địa chỉ:");
            String address = scanner.nextLine();
            System.out.println("Nhập giới ngày sinh:");
            String dateOfBirth = scanner.nextLine();
            System.out.println("Nhập giới email:");
            String email = scanner.nextLine();
            contactList.add(new Contact(phoneNumber, group, name, gender, address, dateOfBirth, email));
            WriteAndReadFile.writeFile(contactList);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean updateContact() {
        Scanner scanner = new Scanner(System.in);
        List<Contact> contactList = new ArrayList<Contact>();
        contactList = WriteAndReadFile.readFile();
        boolean flag = true;
        do {
            try {
                System.out.println("Nhập số điện thoại của danh bạ cần sửa:");
                String phoneNumber = scanner.nextLine();
                for (int i = 0; i < contactList.size(); i++) {
                    if (contactList.get(i).getPhoneNumber().equals(phoneNumber)) {
                        System.out.println("Nhập nhóm của danh bạ cần sửa");
                        String group = scanner.nextLine();
                        System.out.println("Nhập tên của danh bạ cần sửa");
                        String name = scanner.nextLine();
                        System.out.println("Nhập giới tính của danh bạ cần sửa");
                        String gender = scanner.nextLine();
                        System.out.println("Nhập địa chỉ của danh bạ cần sửa");
                        String address = scanner.nextLine();
                        System.out.println("Nhập ngày sinh của danh bạ cần sửa");
                        String dateOfBirth = scanner.nextLine();
                        System.out.println("Nhập email của danh bạ cần sửa");
                        String email = scanner.nextLine();
                        contactList.get(i).setGroup(group);
                        contactList.get(i).setName(name);
                        contactList.get(i).setGender(gender);
                        contactList.get(i).setAddress(address);
                        contactList.get(i).setDateOfBirth(dateOfBirth);
                        contactList.get(i).setEmail(email);
                        return true;
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println("Không tìm được danh bạ với số điện thoại trên");
            String input = scanner.nextLine();
            if (input == null) {
                flag = false;
            }
        } while (flag);
        return false;
    }

    @Override
    public boolean deleteContact() {
        Scanner scanner = new Scanner(System.in);
        List<Contact> contactList = new ArrayList<Contact>();
        contactList = WriteAndReadFile.readFile();
        boolean flag = true;
        do {
            try {
                System.out.println("Nhập số điện thoại của danh bạ cần xóa:");
                String phoneNumber = scanner.nextLine();
                for (int i = 0; i < contactList.size(); i++) {
                    if (contactList.get(i).getPhoneNumber().equals(phoneNumber)) {
                        System.out.println("Xác nhận xóa");
                        String confirm = scanner.nextLine();
                        if (confirm == "Y") {
                            contactList.remove(i);
                            return true;
                        } else {
                            return false;
                        }
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println("Không tìm được danh bạ với số điện thoại trên");
            String input = scanner.nextLine();
            if (input == null) {
                flag = false;
            }
        } while (flag);
        return false;
    }

    @Override
    public void findContact() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tìm kiếm theo" + "\n" +
                "1. Số điện thoại" + "\n" +
                "2. Tên");
        int choice = Integer.parseInt(scanner.nextLine());
        if (choice == 1) {

        }
    }

    @Override
    public void readAllContact() {
        List<Contact> contactList = new ArrayList<Contact>();
        contactList = WriteAndReadFile.readFile();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < contactList.size(); i++) {
            System.out.println(contactList.get(i));
        }
    }
}
