package bai_tap.copy_file_text.run;

import java.io.*;
import java.util.Scanner;

public class Run {
    private static final String DATA_FILE = "C:\\Users\\ASUS\\Desktop\\codegym\\module2\\ss16\\src\\bai_tap\\copy_file_text\\data\\data.csv";
    private static final String NEW_FILE_1 = "C:\\Users\\ASUS\\Desktop\\codegym\\module2\\ss16\\src\\bai_tap\\copy_file_text\\data\\new_file_1.csv";

    public static void main(String[] args) {
        System.out.println("Data file link is: " + DATA_FILE);
        System.out.println("New file link is: " + NEW_FILE_1);
        Scanner in = new Scanner(System.in);
        try {
            System.out.println("Enter the copy file link");
            String copyFileLink = in.nextLine();
            System.out.println("Enter the paste file name: ");
            String pasteFileName = in.nextLine();

            File copyFile = new File(copyFileLink);
            FileReader fileReader = new FileReader(copyFile);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            File pasteFile = new File(pasteFileName);
            FileWriter fileWriter = new FileWriter(pasteFile, false);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            String content = "";
            Boolean first = true;
            do {
                content = bufferedReader.readLine();
                if (content != null) {
                    if (!first) {
                        bufferedWriter.newLine();
                    }
                    bufferedWriter.write(content);
                }
                first = false;
            } while (content != null);
            bufferedReader.close();
            bufferedWriter.close();
            System.out.println("Copy file successfully");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
