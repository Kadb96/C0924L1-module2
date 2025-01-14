package model;

public class XeTai extends Xe {
    private float trongTai;

    public XeTai() {
    }

    public XeTai(String bienKiemSoat, String tenHangSanXuat, int namSanXuat, String chuSoHuu, float trongTai) {
        super(bienKiemSoat, tenHangSanXuat, namSanXuat, chuSoHuu);
        this.trongTai = trongTai;
    }

    public float getTrongTai() {
        return trongTai;
    }

    public void setTrongTai(Float trongTai) {
        this.trongTai = trongTai;
    }

    public String toString() {
        return "Xe tai{" +
                "Bien kiem soat = " + super.getBienKiemSoat() +
                ", Hang san xuat = '" + super.getTenHangSanXuat() + '\'' +
                ", Nam san xuat = '" + super.getNamSanXuat() + '\'' +
                ", Chu so huu = '" + super.getChuSoHuu() + '\'' +
                ", Trong tai = '" + this.trongTai +
                '}';
    }
}
