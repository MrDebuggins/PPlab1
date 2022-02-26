package com.lab1;
import java.io.*;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) throws IOException
    {
	    System.out.println("ohayo!");
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));

        try {
            TimeUnit.SECONDS.sleep(10);
        }catch (Exception e)
        {

        }
        System.out.println("Input: ");
        int a = Integer.parseInt(b.readLine());
    }
}
