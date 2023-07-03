import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;

import javax.management.RuntimeErrorException;


public class Seminar2 {
    Comparator<Integer> comparator;
    Iterator<Iterator> iterator;

    

    public static void main(String[] args) {

        char[] chars = null;
        try{
            File file = new File("file");
            if (!file.exists()){
                String s = "Привет мир!";
                FileWriter writer = new FileWriter(file);
                writer.write(s);
                writer.append("!@");
                writer.close();
            } else {
                FileReader reader = new FileReader(file);
                chars = new char[(int) file.length()];
                reader.read(chars, 0, (int) file.length());
            }
            // FileWriter writer = new FileWriter("df");
        } catch (IOException e) {
            System.out.println("There is an exeption!");
        }
        System.out.println(Arrays.toString(chars));

        String s = "Hi!";
        System.out.println(String.format("%s!", s));
        
        System.out.println(s.concat("!!"));

        s = "Ivanov., Semen, Ivanovich.";
        System.out.println(s.toLowerCase().charAt(0));
        System.out.println(s.substring(0, s.length()/2));
        if (s.equals("H"));
        System.out.println(s.indexOf('v'));
        System.out.println(s.lastIndexOf('v'));
        // s = s.replace(",", "");
        // s = s.replace(".,", "");
        s = s.replaceAll("[.,]", "");
        // String[] a = s.split(" ");
        System.out.println(s);
        // System.out.println(a[0] + " " + a[1].toUpperCase().charAt(0) + ". " + a[2].toUpperCase().charAt(0) + "." );
        
        StringBuilder builder = new StringBuilder();
        builder.append("!");
        builder.indexOf("V", 6);
        builder.reverse();
        builder.replace(0, 7, "ass");
        System.out.println(builder);

        String s1 = "";
        long start = System.currentTimeMillis();
        for (int i = 0; i< 1000; i++){
            s1 += Character.getName(i);
        }
        System.out.println("String time: " + (System.currentTimeMillis() - start));

        StringBuilder builder1  = new StringBuilder(""); start = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++){
            builder1.append(Character.getName(i));
        }
        System.out.println("Builder time: " + (System.currentTimeMillis() - start));



    }
}
