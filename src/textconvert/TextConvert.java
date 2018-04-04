/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package textconvert;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author rob
 */
public class TextConvert {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        String path;
        Scanner fromUser = new Scanner(System.in);
        System.out.println("Podaj nazwe pliku wejsciowego (znajduje sie w dokumentach): ");
        path = fromUser.nextLine();
        Scanner reader = new Scanner(new File("C:\\Users\\rob\\Documents\\"+path));
        System.out.println("Podaj sciezke pliku wyjsciowego: ");
        path = fromUser.nextLine();
        PrintWriter writeFile = new PrintWriter("C:\\Users\\rob\\Documents\\"+path);
        System.out.println("Podaj sciezke pliku wyjsciowego - drugiego");
        path = fromUser.nextLine();
        PrintWriter writeFile2 = new PrintWriter("C:\\Users\\rob\\Documents\\"+path);
        
        while(reader.hasNext()){
        String stringReader = reader.nextLine();
        String[] parts = stringReader.split("	");
        writeFile.println(parts[1]);
        writeFile2.println(parts[2]);
        System.out.println(parts[2]);
        }
        
        writeFile.close();
        writeFile2.close();
    }
    
}
