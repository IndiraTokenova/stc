package part01.lesson06.task02;

import javafx.print.Printer;

import java.io.*;
import java.nio.charset.Charset;

/**
 * @author indira
 * */
public class Main {

    public static void main(String[] args) throws IOException {

        FileManager manager = new FileManager();
        String str = manager.generateParagraph();

        /*PrintWriter printer  = new PrintWriter(new FileOutputStream("qwe.txt", true));
        printer.print(str);*/

        OutputStream out = new FileOutputStream("asd.txt");
        out.write(str.getBytes(Charset.forName("UTF-8")));



    }
}
