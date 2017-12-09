package com.company;

import java.io.File;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner consol = new Scanner(System.in);
String inFile = consol.nextLine();
        File newFile = new File("D:\\Java21/Privet.nat");
           boolean created = newFile.createNewFile();
            if(created)
                System.out.println("װאיכ סמחהאם");
        FileOutputStream file = new FileOutputStream("D:\\Java21/Privet.nat");

        byte[] text=inFile.getBytes();

          file.write(text);


file.close();

    }
}
