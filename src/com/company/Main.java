package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int sen=0, jun=0;
        String[] st = new String[a];
        for(int i=0; i<a; i++){
            st[i] = sc.next();
            if(st[i].equalsIgnoreCase("Senior"))
                sen++;
            else if(st[i].equalsIgnoreCase("Junior"))
                jun++;
            else{
                System.out.println("Invalid");
                System.exit(0);
            }
        }
        System.out.println("Senior count : " + sen);
        System.out.println("Junior count : "+ jun);
    }
}
