package bai_tap.copy_san_pham_file_nhi_phan.run;

import java.io.*;
import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        File sourceFile = null;
        File targetFile = null;
        FileInputStream fis = null;
        FileOutputStream fos = null;
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;

        try {
            System.out.println("Enter source file path:");
            String sourceFilePath = in.nextLine();
            sourceFile = new File(sourceFilePath);
            fis = new FileInputStream(sourceFile);
            bis = new BufferedInputStream(fis);
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            System.out.println("Enter target file path:");
            String targetFilePath = in.nextLine();
            targetFile = new File(targetFilePath);
            fos = new FileOutputStream(targetFile);
            bos = new BufferedOutputStream(fos);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            int i = -1;
            while ((i = bis.read()) != -1) {
                bos.write(i);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
