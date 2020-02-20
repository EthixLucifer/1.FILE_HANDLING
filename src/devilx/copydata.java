package devilx;
import java.io.*;
public class copydata {
    public static void main(String[] args) {
        File ifile = new File("D:\\stream\\write.txt");
        File ofile = new File("D:\\stream\\rj.txt");
        try{
            FileReader fr = new FileReader(ifile);
            FileWriter fw = new FileWriter(ofile,true);

            int ch;
            while((ch=fr.read())!=-1)
            {
                fw.write(ch);
            }
          fr.close();
            fw.close();
        }

        catch (Exception e)
        {
            System.out.println("Exception Handled");
        }

    }
}
