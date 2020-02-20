package devilx;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class read {
    public static void main(String[] args) {


    try{
        File f2 = new File("D:\\stream\\write.txt");
        Scanner in = new Scanner(f2);
        while(in.hasNextLine())
        {
            String data = in.nextLine();
            System.out.println(data);
        }

    }
    catch(FileNotFoundException e)
    {
        System.out.println("File not found ::");
    }
}}
