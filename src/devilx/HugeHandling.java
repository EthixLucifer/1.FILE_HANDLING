package devilx;
import java.io.*;
import java.util.Scanner;
public class HugeHandling {
    public static void main(String[] args) {
        boolean chk = true;
        Scanner in = new Scanner(System.in);

        while(chk == true){
            System.out.println("1) to create a file ::");
            System.out.println("2) to Write data into the file :::");
            System.out.println("3) to copy the data from one file to other :::");
            System.out.println("4) to read data from a specified File :::");
            int a = in.nextInt();
            switch (a)
            {
            case 1:

                System.out.println("Enter the name of the directory and file name with extension:::");
                String A = in.next();
                File  f = new File(A);
                try{
                      f.createNewFile();
                      if (f.exists())
                          System.out.println("FILE CREATED :::");
                      else
                          System.out.println("FILE ALREADY EXISTS :::");

                   }
                 catch (Exception e)
                  {
                      System.out.println("exception handled ::");
                      e.printStackTrace();
                  }
                break;
                case 2:
                    System.out.println("Enter the file name and directory to write in :::");
                    String data  = in.next();

                    try {

                        FileWriter fr = new FileWriter(data);
                        BufferedWriter br = new BufferedWriter(fr);
                        System.out.println("Enter the data you wanna write ::");
                        String S = in.next();
                        fr.write(S);
                        fr.close();
                    }
                    catch (FileNotFoundException e)
                    {
                        System.out.println("file not found Exception handled ::");
                        e.printStackTrace();
                    }
                    catch (IOException e1)
                    {
                        System.out.println("IO Exception Handled ::");
                        e1.printStackTrace();
                    }
                    break;
                case 3:

                   try {
                       System.out.println("Enter the name of the File to copy data from ::");
                       String a1 = in.next();
                       FileReader rfile = new FileReader(a1);
                       System.out.println("Enter the name of the File to copy data to ::");
                       String a2 = in.next();
                       FileWriter wfile = new FileWriter(a2,true);
                       int ch;
                       while((ch = rfile.read())!= -1)
                       {
                           wfile.write(ch);
                       }
                       rfile.close();
                       wfile.close();
                   }
                    catch (Exception e)
                    {
                        System.out.println("Exception Handled :::");
                        e.printStackTrace();
                    }
                   break;
                case 4:
                    try {
                        System.out.println("Specify name and directory of file to read data from:::");
                        String SS = in.next();
                        File f2 = new File(SS);
                        Scanner sc = new Scanner(f2);
                        while (sc.hasNextLine()) {
                            String Sd = sc.nextLine();
                            System.out.println(Sd);
                        }

                    }
                    catch(FileNotFoundException  e)
                    {
                        System.out.println("File not found Exception handled::");
                    }
                   default:
                       System.out.println("You are going to exit now :::");
                       break;

            }
            break;
        }
    }
}
