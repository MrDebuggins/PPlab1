package com.lab1;
import java.io.*;
import java.util.Iterator;
import java.util.Scanner;
import java.util.ArrayList;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        ArrayList<String> stringBuilder = new ArrayList<>();

	    System.out.println("Start running...");
        try
        {
            FileReader read = new FileReader("text.txt");
            Scanner scan = new Scanner(read);

            System.out.println("Original file: ");
            String str;
            while(scan.hasNextLine())
            {
                try
                {
                    str = scan.nextLine();
                }catch (Exception e)
                {
                    break;
                }

                stringBuilder.add(str);
                System.out.println(str);
            }
            scan.close();

            for(int i = 0; i < stringBuilder.size(); i++)
            {
                str = stringBuilder.get(i);

                str = str.replace(".", "");
                str = str.replace(",", "");
                str = str.replace("?", "");
                str = str.replace("!", "");
                str = str.replace("(", "");
                str = str.replace(")",  "");

                str = str.replace("  ", " ");
                str = str.replace("a", "A");

                stringBuilder.set(i, str);
            }

            FileWriter write = new FileWriter("text.txt");
            System.out.println("\nEditted file:");
            for(int i = 0; i < stringBuilder.size(); i++)
            {
                str = stringBuilder.get(i);
                System.out.println(str);
                write.write(str + "\n");
            }
            write.close();
        }
        catch (FileNotFoundException e)
        {
            System.out.println("File not found!");
        }
    }
}
