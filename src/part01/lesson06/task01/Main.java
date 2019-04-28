package part01.lesson06.task01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    /**
     *  Написать программу, читающую текстовый файл. Программа должна составлять отсортированный
     *  по алфавиту список слов, найденных в файле и сохранять его в файл-результат.
     *  Найденные слова не должны повторяться, регистр не должен учитываться.
     *  Одно слово в разных падежах – это разные слова.
     * */

    public static void main(String[] args) {

        try (FileInputStream inputStream = new FileInputStream("input.txt")) {
            int length = inputStream.available();
            byte data[] = new byte[length];
            inputStream.read(data);

            String textFromFile = new String(data);

            List<String> strList = new ArrayList<>();

            StringBuilder str = new StringBuilder();
            for (int i = 0; i < textFromFile.length(); i++) {
                if (textFromFile.charAt(i) == '\n' || textFromFile.charAt(i) == '\t' || textFromFile.charAt(i) == ' ') {
                    strList.add(str.toString());
                    str = new StringBuilder();
                } else {
                    str.append(textFromFile.charAt(i));
                }
            }
            System.out.println(strList);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
