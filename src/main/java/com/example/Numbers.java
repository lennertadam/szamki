package com.example;

import java.text.NumberFormat;
import java.util.Scanner;

public class Numbers {
    public static void task(){
        Scanner scanner=new Scanner(System.in);
        System.err.println("Átalakítandó Szám: ");

        String numString=scanner.nextLine();
        Integer number=Integer.parseInt(numString);
        String formattedNumber=NumberFormat.getInstance().format(number);
        System.out.println("Átalakított Szám: "+formattedNumber);
        
        scanner.close();
    }
}
