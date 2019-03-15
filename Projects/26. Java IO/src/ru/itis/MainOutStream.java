package ru.itis;

import java.io.FileOutputStream;
import java.io.OutputStream;

/**
 * 14.03.2019
 * MainOutStream
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class MainOutStream {
    public static void main(String[] args) throws Exception {
        OutputStream outputStream = new FileOutputStream("output.txt");
        outputStream.write('H');
        outputStream.write('e');
        outputStream.write('l');
        outputStream.write('l');
        outputStream.write('o');

        outputStream.write("Marsel".getBytes());
    }
}
