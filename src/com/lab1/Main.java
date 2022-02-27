package com.lab1;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException
    {
	    System.out.println("Start running...");
        try
        {
            File obj = new File("text.txt");
            Scanner scan = new Scanner(obj);
            String str = scan.nextLine();
            System.out.println(str);
        }catch (FileNotFoundException e)
        {
            System.out.println("File not found!");
        }
    }
}
