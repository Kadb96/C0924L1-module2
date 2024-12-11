package baitap.xay_dung_lop_chi_ghi_trong_java;

public class Student {
    private String name = "John";
    private String classes = "C02";

    public Student() {
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "Student [name=" + name + ", classes=" + classes + "]";
    }
}
