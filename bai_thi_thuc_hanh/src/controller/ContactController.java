package controller;

import service.ContactService;

import java.util.Scanner;

public class ContactController {
    public static void showContactListMenu() {
        Scanner scanner = new Scanner(System.in);
        ContactService contactService = new ContactService();
        int choose = 0;

        while (true) {
            System.out.println("----CHƯƠNG TRÌNH QUẢN LÝ DANH BẠ----" + "\n" +
                    "  Chọn chức năng theo số (để tiếp tục):" + "\n" +
                    "  1. Xem danh sách" + "\n" +
                    "  2. Thêm mới" + "\n" +
                    "  3. Cập nhật" + "\n" +
                    "  4. Xoá" + "\n" +
                    "  5. Tìm kiếm" + "\n" +
                    "  6. Đọc từ file" + "\n" +
                    "  7. Ghi vào file" + "\n" +
                    "  8. Thoát" + "\n" +
                    "  Chọn chức năng:");
            choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    contactService.showContact();
                    break;
                case 2:
                    if (contactService.addContact()) {
                        System.out.println("Thêm mới thành công");
                    } else {
                        System.out.println("Thêm mới thất bại");
                    }
                    break;
                case 3:
                    if (contactService.updateContact()) {
                        System.out.println("Cập nhật thành công");
                    } else {
                        System.out.println("Cập nhật thất bại");
                    }
                    break;
                case 4:
                    if (contactService.deleteContact()) {
                        System.out.println("Xóa thành công");
                    } else {
                        System.out.println("Xóa thất bại");
                    }
                    break;
                case 5:
                    break;
                case 6:
                    contactService.readAllContact();
                    break;
                case 7:
                    System.out.println("file đã ghi");
                    break;
                case 8:
                    System.out.println("Thoát");
                    System.exit(0);
            }
        }
    }
}
