package model;

public abstract class Xe {
    private String bienKiemSoat;
    private String tenHangSanXuat;
    private int namSanxuat;
    private String chuSoHuu;

    public Xe() {
    }

    public Xe (String bienKiemSoat, String tenHangSanXuat, int namSanxuat, String chuSoHuu) {
        this.bienKiemSoat = bienKiemSoat;
        this.tenHangSanXuat = tenHangSanXuat;
        this.namSanxuat = namSanxuat;
        this.chuSoHuu = chuSoHuu;
    }

    public String getBienKiemSoat() {
        return bienKiemSoat;
    }

    public void setBienKiemSoat(String bienKiemSoat) {
        this.bienKiemSoat = bienKiemSoat;
    }

    public String getTenHangSanXuat() {
        return tenHangSanXuat;
    }

    public void setTenHangSanXuat(String tenHangSanXuat) {
        this.tenHangSanXuat = tenHangSanXuat;
    }

    public int getNamSanXuat() {
        return namSanxuat;
    }

    public void setNamSanXuat(int namSanxuat) {
        this.namSanxuat = namSanxuat;
    }

    public String getChuSoHuu() {
        return chuSoHuu;
    }

    public void setChuSoHuu(String chuSoHuu) {
        this.chuSoHuu = chuSoHuu;
    }
}
