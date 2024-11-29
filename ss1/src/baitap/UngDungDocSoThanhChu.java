package baitap;

import java.util.Scanner;

public class UngDungDocSoThanhChu {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] numberArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        String[] textArray = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        System.out.println("Insert number");
        int numb = Integer.parseInt(in.nextLine());
        if (numb < 0) {
            System.out.println("Out of ability");
        } else if (numb == 0) {
            System.out.println("Zero");
        } else if (numb > 999) {
            System.out.println("Out of ability");
        } else if (numb < 10) {
            for (int i = 0; i < numberArray.length; i++) {
                if (numb == numberArray[i]) {
                    System.out.println(textArray[i]);
                    break;
                }
            }
        } else if (numb < 20) {
            if (numb == 10) {
                System.out.println("ten");
            } else if (numb == 11) {
                System.out.println("eleven");
            } else if (numb == 12) {
                System.out.println("twelve");
            } else if (numb == 13) {
                System.out.println("thirteen");
            } else if (numb == 15) {
                System.out.println("fifteen");
            } else {
                String texts = "";
                for (int i = 0; i < numberArray.length; i++) {
                    if (numb - 10 == numberArray[i]) {
                        texts += textArray[i];
                    }
                }
                System.out.println(texts + "teen");
            }
        } else if (numb < 100) {
            int ten = numb / 10;
            int unit = numb % 10;
            String texts = "";
            if (ten == 2) {
                texts += "twenty";
            } else if (ten == 3) {
                texts += "thirty";
            } else if (ten == 5) {
                texts += "fifty";
            } else {
                for (int i = 0; i < numberArray.length; i++) {
                    if (ten == numberArray[i]) {
                        texts += textArray[i];
                        break;
                    }
                }
                texts += "ty";
            }
            for (int i = 0; i < textArray.length; i++) {
                if (unit == numberArray[i]) {
                    texts = texts + " " + textArray[i];
                }
            }
            System.out.println(texts);
        } else {
            int hundred = numb / 100;
            int ten = (numb % 100) / 10;
            int unit = (numb % 100) % 10;
            String texts = "";
            for (int i = 0; i < numberArray.length; i++) {
                if (hundred == numberArray[i]) {
                    texts = textArray[i] + "-hundred";
                }
            }
            if (ten == 0 && unit == 0) {
            } else if (ten == 0) {
                for (int i = 0; i < numberArray.length; i++) {
                    if (unit == numberArray[i]) {
                        texts = texts + " and " + textArray[i];
                    }
                }
            } else if (ten == 1 && unit == 0) {
                texts = texts + " and ten";
            } else if (ten == 1 && unit == 1) {
                texts = texts + " and eleven";
            } else if (ten == 1 && unit == 2) {
                texts = texts + " and twelve";
            } else if (ten == 1 && unit == 3) {
                texts = texts + " and thirteen";
            } else if (ten == 1 && unit == 5) {
                texts = texts + " and fifteen";
            } else if (ten == 1) {
                texts = texts + " and ";
                for (int i = 0; i < numberArray.length; i++) {
                    if (unit == numberArray[i]) {
                        texts = texts + " " + textArray[i] + "teen";
                        break;
                    }
                }
            } else if (ten == 2) {
                texts = texts + " and twenty";
                for (int i = 0; i < numberArray.length; i++) {
                    if (unit == numberArray[i]) {
                        texts = texts + " " + textArray[i];
                        break;
                    }
                }
            } else if (ten == 3) {
                texts = texts + " and thirty";
                for (int i = 0; i < numberArray.length; i++) {
                    if (unit == numberArray[i]) {
                        texts = texts + " " + textArray[i];
                        break;
                    }
                }
            } else if (ten == 5) {
                texts = texts + " and fifty";
                for (int i = 0; i < numberArray.length; i++) {
                    if (unit == numberArray[i]) {
                        texts = texts + " " + textArray[i];
                        break;
                    }
                }
            } else {
                texts = texts + " and ";
                for (int i = 0; i < numberArray.length; i++) {
                    if (ten == numberArray[i]) {
                        texts = texts + textArray[i] + "ty";
                        break;
                    }
                }
                for (int i = 0; i < numberArray.length; i++) {
                    if (unit == numberArray[i]) {
                        texts = texts + " " + textArray[i];
                        break;
                    }
                }
            }
            System.out.println(texts);
        }
    }
}
