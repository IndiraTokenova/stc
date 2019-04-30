package part01.lesson06.task01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

/**
 * @author indira
 * */
public class Main {

    public static void main(String[] args) {

        try (FileInputStream inputStream = new FileInputStream("input.txt")) {
            int length = inputStream.available();
            byte data[] = new byte[length];
            inputStream.read(data);

            String textFromFile = new String(data);

            Set<String> strSet = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);

            StringBuilder str = new StringBuilder();
            for (int i = 0; i < textFromFile.length(); i++) {
                if (textFromFile.charAt(i) == '\n' || textFromFile.charAt(i) == '\t' || textFromFile.charAt(i) == ' ') {
                    strSet.add(str.toString());
                    str = new StringBuilder();
                } else {
                    str.append(textFromFile.charAt(i));
                }
            }
            System.out.println(strSet);


        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
