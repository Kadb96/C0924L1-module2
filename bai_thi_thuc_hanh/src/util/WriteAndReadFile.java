package util;

import model.Contact;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class WriteAndReadFile {
    public static final String FILE_PATH = "bai_thi_thuc_hanh/src/data/contact.csv";

    public static List<Contact> readFile() {
        File file = new File(FILE_PATH);
        FileReader fr = null;
        BufferedReader br = null;
        List<Contact> contactList = new ArrayList<Contact>();
        try {
            fr = new FileReader(file);
            br = new BufferedReader(fr);
            String line = null;
            do {
                line = br.readLine();
                if (line != null) {
                    String phoneNumber = line.split(",")[0];
                    String group = line.split(",")[1];
                    String name = line.split(",")[2];
                    String gender = line.split(",")[3];
                    String address = line.split(",")[4];
                    String dateOfBirth = line.split(",")[5];
                    String email = line.split(",")[6];
                    contactList.add(new Contact(phoneNumber, group, name, gender, address, dateOfBirth, email));
                }
            } while (line != null);
            br.close();
        } catch (EOFException e) {
            contactList = new ArrayList<Contact>();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return contactList;
    }

    public static void writeFile(List<Contact> contactList) throws IOException {
        File file = new File(FILE_PATH);
        FileWriter fw = new FileWriter(file, false);
        BufferedWriter bw = new BufferedWriter(fw);
        boolean first = true;
        for (Contact contact : contactList) {
            if (!first) {
                bw.newLine();
            }
            bw.write(contact.getPhoneNumber() + "," + contact.getGroup() + "," + contact.getName()
                    + "," + contact.getGender() + "," + contact.getAddress() + "," + contact.getDateOfBirth()
                    + "," + contact.getEmail());
            first = false;
        }
        bw.close();
    }
}