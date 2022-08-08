package com.company;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        //String fileName = "E:\\study\\semestr_4\\JAVA\\tests";
        String fileName = args[0];
        File file = new File(fileName);

        if (!file.isDirectory()) System.out.println("Directory not found: " + fileName);
        else if (file.listFiles().length == 0) System.out.println("Directory is empty: " + fileName);
        else
        {
            System.out.println("Are you sure? That you want to delete " + file.listFiles().length + " files?(y/n)");
            Scanner sc = new Scanner(System.in);
            String str = sc.nextLine();
            if (!str.equalsIgnoreCase("y")) return;

            File[] fileList = file.listFiles();
            for (File f: fileList) f.delete();

            System.out.println("Files deleted!");
        }

    }
}
