package com.company;
import java.lang.*;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Завдання 1");
        System.out.println("Введіть число :");
        String str = sc.nextLine();
        SymbolTest(str);
        System.out.println("Завдання 2");
        System.out.println("Введіть два числа : ");
        double a = sc.nextDouble(),b=sc.nextDouble();
	    zd2(a,b);
    }


    public static void SymbolTest(String x) {
        int n = Integer.parseInt(x);
        for ( int i = 0; i < n; i++ ) {
            char c = (char)(Math.random()*26 + 'a');
            System.out.print(c + ": ");
            switch ( c ) {
                    case 'a': case 'e': case 'i':
                    case 'o': case 'u':
                        System.out.println("гласная");
                        break;
                    case 'y': case 'w':
                        System.out.println("иногда гласная");
                        break;
                    default:
                        System.out.println("согласная");
                }
        }
    }

    public static void zd2(double a,double b){
        double hypot = Math.hypot(a,b);
        double sinA = a/hypot;
        double A = Math.round(Math.toDegrees(Math.asin(sinA)));
        double B = 90 - A;
        double sinB = b/hypot;
        System.out.println(A);
        System.out.println(B);
    }
}



