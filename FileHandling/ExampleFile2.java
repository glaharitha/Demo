package FileHandling;

import java.io.*;



public class ExampleFile2 {

        public static void main(String[] args) throws IOException {


            String path = System.getProperty("user.dir") + File.separator + "TestData" + File.separator + "config.properties";
            System.out.println(path);
            File file = new File(path);
          //  if (file.exists()) {
          //      System.out.println("File exist");
          //  } else {

         //       file.createNewFile();
          //      System.out.println("File exist!");
         //   }
            FileReader fr = new FileReader(path);
            BufferedReader br = new BufferedReader(fr);


          //  bw.write("url = https://www.google.com");
         //   bw.newLine();
         //   bw.write("username = laharitha");
         //   bw.newLine();
         //   bw.write("password = lahari@123");
            int i;
            while((i=br.read())!=-1){
                System.out.print((char)i);
            }
            br.close();
            fr.close();

        }
    }


