package model;

public class XeMay extends Xe {
    private float congSuat;

    public XeMay() {
    }

    public XeMay(String bienKiemSoat, String tenHangSanXuat, int namSanXuat, String chuSoHuu, float congSuat) {
        super(bienKiemSoat, tenHangSanXuat, namSanXuat, chuSoHuu);
        this.congSuat = congSuat;
    }

    public float getCongSuat() {
        return congSuat;
    }

    public void setCongSuat(Float congSuat) {
        this.congSuat = congSuat;
    }

    public String toString() {
        return "Xe may{" +
                "Bien kiem soat = " + super.getBienKiemSoat() +
                ", Hang san xuat = '" + super.getTenHangSanXuat() + '\'' +
                ", Nam san xuat = '" + super.getNamSanXuat() + '\'' +
                ", Chu so huu = '" + super.getChuSoHuu() + '\'' +
                ", Cong suat = '" + this.congSuat +
                '}';
    }
}
