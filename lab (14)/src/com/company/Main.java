package com.company;

import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) {
        String fileName = "test.txt";
        String line;
        BufferedReader br =null;
        try {
            br = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)));
            while ((line = br.readLine()) != null)
            {
                StringTokenizer st = new StringTokenizer(line);
                System.out.println("Line: \n"+line+"\nElements: ");
                while (st.hasMoreTokens()) {
                    String str = st.nextToken();
                    char c = str.charAt(0);
                    if( c < '0' || c > '9' )
                        System.out.println(str+" - not number");
                    else {
                        double d = Double.parseDouble(str);
                        System.out.println(str+" - number  = "+d);
                    }
                }
                System.out.println();
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not find: " + fileName);
            System.out.println("Error: " + e);
        } catch (IOException e) {
            System.out.println("Error input/output file:" + fileName);
            System.out.println("Error: " + e);
        } finally {
            if ( br != null )
                try {
                    br.close();
                } catch ( IOException ex ) {
                    System.out.println("Error closing : " + fileName);
                    System.out.println("Error: " + ex);
                }
        }
    }
}
