package com.company;
import java.lang.*;
import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Завдання 1");
        pr1();

        System.out.println("Завдання 2");
        pr2();
    }

    public  static  void pr1(){
        double a = 30,b = 35,c ,d;
        c = Math.toRadians(a);
        d = Math.toRadians(b);
        System.out.println("sin a : " + Math.sin(c));
        System.out.println("sin b : " + Math.sin(d));
        System.out.println("cos a : " + Math.cos(c));
        System.out.println("cos b : " + Math.cos(d));
    }

    public static  void pr2(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть градуси : ");
        double a = sc.nextDouble();
//        double a = 0;
//        try{
//            a = Double.parseDouble(System.in.read());
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        double b = Math.toRadians(a);
        System.out.println(a);
        System.out.println("sin : " + Math.sin(b));
        System.out.println("cos : " + Math.cos(b));
    }
}
