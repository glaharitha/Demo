package FileHandling;

import java.io.*;

public class ExampleFile {

    public static void main(String[] args) throws IOException {


        String path = System.getProperty("user.dir") + File.separator + "TestData" + File.separator + "demo.txt";
        System.out.println(path);
        File file = new File(path);
        if (file.exists()) {
            System.out.println("File exist");
        } else {

            file.createNewFile();
            System.out.println("File exist!");
        }
        FileWriter fw = new FileWriter(file);
        BufferedWriter bw = new BufferedWriter(fw);

        bw.write("Hello world!");
        bw.newLine();
        bw.write("Hi Laharitha");
        bw.flush();
        bw.close();

        FileReader fr = new FileReader(path);
        BufferedReader br = new BufferedReader(fr);

        int i ;
        while((i=br.read())!=-1){
            System.out.print((char)i);

        }

            br.close();
            fr.close();

    }
}
