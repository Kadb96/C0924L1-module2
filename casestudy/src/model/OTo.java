package model;

public class OTo extends Xe {
    private int soChoNgoi;
    private String kieuXe;

    public OTo () {};

    public OTo (String bienKiemSoat, String tenHangSanXuat, int namSanXuat, String chuSoHuu, int soChoNgoi, String kieuXe) {
        super(bienKiemSoat, tenHangSanXuat, namSanXuat, chuSoHuu);
        this.setSoChoNgoi(soChoNgoi);
        this.setKieuXe(kieuXe);
    }

    public int getSoChoNgoi() {
        return soChoNgoi;
    }

    public void setSoChoNgoi(int soChoNgoi) {
        this.soChoNgoi = soChoNgoi;
    }

    public String getKieuXe() {
        return kieuXe;
    }

    public void setKieuXe(String kieuXe) {
        this.kieuXe = kieuXe;
    }

    public String toString () {
        return "O to{" +
                "Bien kiem soat = " + super.getBienKiemSoat() +
                ", Hang san xuat = '" + super.getTenHangSanXuat() + '\'' +
                ", Nam san xuat = '" + super.getNamSanXuat() + '\'' +
                ", Chu so huu = '" + super.getChuSoHuu() + '\'' +
                ", Kieu xe = '" + this.kieuXe + '\'' +
                ", So cho ngoi = '" + this.soChoNgoi +
                '}';
    }
}
