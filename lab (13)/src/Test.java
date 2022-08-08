import java.util.*;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Test {

    public static void main(String args[]) {

        String file = "text.txt";
        ArrayList<String> list = new ArrayList<String>();
        String line;
        BufferedReader bReader = new BufferedReader (new InputStreamReader(System.in));
        String findline = "Hello World !!))" ;

        BufferedReader br =null;
        try {
            System.out.print("String that you want to find :");
            findline = bReader.readLine();
            System.out.println();
            System.out.println();
            FileInputStream a = new FileInputStream(fileName);
            InputStreamReader b = new InputStreamReader(a,StandardCharsets.UTF_8);

            br = new BufferedReader(b);

            System.out.println("Unsorted list:");
            while ((line = br.readLine()) != null) {
                list.add(line);
                System.out.println(line);
            }
            System.out.println();
            Collections.sort(list);
            System.out.println();

            Iterator<String> iter = list.iterator();
            while( iter.hasNext() ) {
                String str = (String)iter.next();
                System.out.println(str);
            }
            System.out.println();
            int len=list.size();
            int k = 0;
            for(int i=0; i<len; i++) {
                if (list.get(i).equals(findline)) {
                    System.out.println();
                    System.out.println(list.get(i));
                    k++;
                }
            }
            if(k==0) {
                System.out.println("String not found!");
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found "+ fileName);
            System.out.println("Error: " + e);
        } catch (IOException e) {
            System.out.println("Error with input/output. File: " + fileName);
            System.out.println("Error: " + e);
        }  finally {

            if ( br != null )
                try {
                    br.close();
                } catch ( IOException ex ) {
                    System.out.println("Error with closing file" + fileName);
                    System.out.println("Error: " + ex);
                }
            br = null;
        }
    }
}