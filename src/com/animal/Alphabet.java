package com.animal;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Alphabet {
    public static void aAndN() {
        try (FileWriter fileWriter = new FileWriter("alphabet.txt")) {
            for (char i = 'A'; i <= 'Z'; i++) {
                String a = i + "" + Character.toLowerCase(i);
                fileWriter.append(a + "\n");

            }
            for (char i = '0'; i <= '9'; i++) {
                fileWriter.append(i + "\n");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        try (FileReader fileReader=new FileReader("alphabet.txt")){
            Scanner scanner =new Scanner(fileReader);
            int a =1;
            while (scanner.hasNext()){
                System.out.println(a + ": "+scanner.nextLine());
                a++;

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

