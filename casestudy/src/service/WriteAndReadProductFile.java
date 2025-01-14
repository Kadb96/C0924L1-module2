package service;

import model.OTo;
import model.XeMay;
import model.XeTai;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class WriteAndReadProductFile {
    public static final String FILE_PATH_O_TO = "casestudy/src/data/oTo.csv";
    public static final String FILE_PATH_XE_MAY = "casestudy/src/data/xeMay.csv";
    public static final String FILE_PATH_XE_TAI = "casestudy/src/data/xeTai.csv";

    public static List<OTo> readFileOTo() {
        File file = new File(FILE_PATH_O_TO);
        FileReader fr = null;
        BufferedReader br = null;
        List<OTo> oToList = new ArrayList<OTo>();
        try {
            fr = new FileReader(file);
            br = new BufferedReader(fr);
            String line = null;
            do {
                line = br.readLine();
                if (line != null) {
                    String bienKiemSoat = line.split(",")[0];
                    String tenHangSanXuat = line.split(",")[1];
                    int namSanXuat = Integer.parseInt(line.split(",")[2]);
                    String chuSoHuu = line.split(",")[3];
                    int soChoNgoi = Integer.parseInt(line.split(",")[4]);
                    String kieuXe = line.split(",")[5];
                    oToList.add(new OTo(bienKiemSoat, tenHangSanXuat, namSanXuat, chuSoHuu, soChoNgoi, kieuXe));
                }
            } while (line != null);
            br.close();
        } catch (EOFException e) {
            oToList = new ArrayList<OTo>();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return oToList;
    }

    public static List<XeMay> readFileXeMay() {
        File file = new File(FILE_PATH_XE_MAY);
        FileReader fr = null;
        BufferedReader br = null;
        List<XeMay> xeMayList = new ArrayList<XeMay>();
        try {
            fr = new FileReader(file);
            br = new BufferedReader(fr);
            String line = null;
            do {
                line = br.readLine();
                if (line != null) {
                    String bienKiemSoat = line.split(",")[0];
                    String tenHangSanXuat = line.split(",")[1];
                    int namSanXuat = Integer.parseInt(line.split(",")[2]);
                    String chuSoHuu = line.split(",")[3];
                    float congSuat = Integer.parseInt(line.split(",")[4]);
                    xeMayList.add(new XeMay(bienKiemSoat, tenHangSanXuat, namSanXuat, chuSoHuu, congSuat));
                }
            } while (line != null);
            br.close();
        } catch (EOFException e) {
            xeMayList = new ArrayList<XeMay>();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return xeMayList;
    }

    public static List<XeTai> readFileXeTai() {
        File file = new File(FILE_PATH_XE_TAI);
        FileReader fr = null;
        BufferedReader br = null;
        List<XeTai> xeTaiList = new ArrayList<XeTai>();
        try {
            fr = new FileReader(file);
            br = new BufferedReader(fr);
            String line = null;
            do {
                line = br.readLine();
                if (line != null) {
                    String bienKiemSoat = line.split(",")[0];
                    String tenHangSanXuat = line.split(",")[1];
                    int namSanXuat = Integer.parseInt(line.split(",")[2]);
                    String chuSoHuu = line.split(",")[3];
                    float trongTai = Integer.parseInt(line.split(",")[4]);
                    xeTaiList.add(new XeTai(bienKiemSoat, tenHangSanXuat, namSanXuat, chuSoHuu, trongTai));
                }
            } while (line != null);
            br.close();
        } catch (EOFException e) {
            xeTaiList = new ArrayList<XeTai>();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return xeTaiList;
    }

    public static void writeFileOTo(List<OTo> oToList) throws IOException {
        File file = new File(FILE_PATH_O_TO);
        FileWriter fw = new FileWriter(file, false);
        BufferedWriter bw = new BufferedWriter(fw);
        boolean first = true;
        for (OTo oTo : oToList) {
            if (!first) {
                bw.newLine();
            }
            bw.write(oTo.getBienKiemSoat() + "," + oTo.getTenHangSanXuat() + "," + oTo.getNamSanXuat()
                    + "," + oTo.getChuSoHuu() + "," + oTo.getSoChoNgoi() + "," + oTo.getKieuXe());
            first = false;
        }
        bw.close();
    }

    public static void writeFileXeMay(List<XeMay> xeMayList) throws IOException {
        File file = new File(FILE_PATH_XE_MAY);
        FileWriter fw = new FileWriter(file, false);
        BufferedWriter bw = new BufferedWriter(fw);
        boolean first = true;
        for (XeMay xeMay : xeMayList) {
            if (!first) {
                bw.newLine();
            }
            bw.write(xeMay.getBienKiemSoat() + "," + xeMay.getTenHangSanXuat() + "," + xeMay.getNamSanXuat()
                    + "," + xeMay.getChuSoHuu() + "," + xeMay.getCongSuat());
            first = false;
        }
        bw.close();
    }

    public static void writeFileXeTai(List<XeTai> xeTaiList) throws IOException {
        File file = new File(FILE_PATH_XE_TAI);
        FileWriter fw = new FileWriter(file, false);
        BufferedWriter bw = new BufferedWriter(fw);
        boolean first = true;
        for (XeTai xeTai : xeTaiList) {
            if (!first) {
                bw.newLine();
            }
            bw.write(xeTai.getBienKiemSoat() + "," + xeTai.getTenHangSanXuat() + "," + xeTai.getNamSanXuat()
                    + "," + xeTai.getChuSoHuu() + "," + xeTai.getTrongTai());
            first = false;
        }
        bw.close();
    }
}
