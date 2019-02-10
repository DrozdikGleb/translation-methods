package ru.drozdov.tojavatranslation;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String input = "";
        try {
            Scanner in = new Scanner(new File("in.txt"));
            while (in.hasNextLine()) {
                input += in.nextLine();
                input += "\n";
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(input);
    }
}
