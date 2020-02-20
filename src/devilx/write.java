package devilx;

import java.io.*;
import java.util.Scanner;

public class write {
    public static void main(String[] args) {

        try{

            File f1 = new File("D:\\stream\\write.txt");
            FileWriter writer  = new FileWriter("D:\\stream\\write.txt",true);
            BufferedWriter bw = new BufferedWriter(writer);
            f1.createNewFile();
            Scanner in = new Scanner(System.in);

            System.out.println("Enter the data you want to store in your File ");
            String data = in.nextLine();
            bw.write(data);
            bw.close();
        }
        catch (IOException e )
        {
            System.out.println("An Error Occured While Creating A File ::");
        }

    }
}
