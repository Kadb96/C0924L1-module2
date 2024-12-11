package baitap.xay_dung_lop_chi_ghi_trong_java;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Student student1 = new Student();
        System.out.println("----Before set name and classes----");
        System.out.println(student1.toString());
        System.out.println("----Set name----");
        student1.setName(in.nextLine());
        System.out.println("----Set classes----");
        student1.setClasses(in.nextLine());
        System.out.println("----After set name and classes----");
        System.out.println(student1.toString());
    }
}
