/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithmns;

import java.io.*;

/**
 *
 * @author Kevin Barassa
 */

public class Appender {
	public static void main(String[] args) throws IOException {
    addLines("C:\\Users\\Kevin Barassa\\Desktop\\hackerrank\\emails.txt", "C:\\Users\\Kevin Barassa\\Desktop\\hackerrank\\appended_emails.txt");
}

public static void addLines(String fileName, String secondFile) throws IOException {
    File file = new File(fileName);
    FileReader fr = new FileReader(file);
    BufferedReader br = new BufferedReader(fr);
    String line = null;
    PrintWriter writer = new PrintWriter(secondFile, "UTF-8");
    while ((line = br.readLine()) != null) {
        writer.print(";");
        writer.println(line);
        
    }
    br.close();
    writer.close();
}
}