package part01.lesson06.task02;

import javafx.print.Printer;

import java.io.*;
import java.nio.charset.Charset;

/**
 * @author indira
 * */
public class Main {

    public static void main(String[] args) throws IOException {

        File file = null;
        FileOutputStream outStream = null;
        try {
            FileManager manager = new FileManager();
            //String str = manager.generateText();

        /*PrintWriter printer  = new PrintWriter(new FileOutputStream("qwe.txt", true));
        printer.print(str);*/

            file = new File("asd.txt");
            outStream = new FileOutputStream(file);

            if (!file.exists()) {
                file.createNewFile();
            }

            manager.getFiles("\\files", 5, 6000, manager.generateWordsArray(), 5);

/*
            byte[] text = str.getBytes(Charset.forName("UTF-8"));
            System.out.println(str);
            outStream.write(str.getBytes(*//*Charset.forName("UTF-8")*//*));*/

            outStream.flush();
            outStream.close();

           // manager.generateWordsArray();

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (outStream != null) {
                    outStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }





    }
}
