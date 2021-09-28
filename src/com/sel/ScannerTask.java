package com.sel;

import java.util.Scanner;

public class ScannerTask
{
	public static void main(String[] args) {
    {
        Scanner s=new Scanner(System.in);
        System.out.println("enter name");
        String name=s.nextLine();
        System.out.println("name is "+name);
        System.out.println("enter place");
        String place=s.next();
        System.out.println("place is "+place);
        System.out.println("enter roll");
        int roll = s.nextInt();
        System.out.println("roll is"+roll);
        s.close();
    }
}
}