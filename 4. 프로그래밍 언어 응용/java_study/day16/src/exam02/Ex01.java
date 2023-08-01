package exam02;

import java.io.*;

public class Ex01 {
    public static void main(String[] args) {
        try(FileInputStream fis = new FileInputStream("data4.txt");
            InputStreamReader isr = new InputStreamReader(fis);
            BufferedReader br = new BufferedReader(isr)) {
            int ch;
            while ((ch = br.read()) != -1){
                System.out.print((char)ch);
            }
            /*
            int ch = fis.read();
            System.out.println((char)ch);

            ch = fis.read();
            System.out.println((char)ch);

            ch = fis.read();
            System.out.println((char)ch);

            ch = fis.read();
            System.out.println((char)ch);

            ch = fis.read();
            System.out.println(ch);
            System.out.println((char)ch);

            int ch;
            while ((ch = fis.read()) != -1){
                System.out.println((char)ch);
            }
            */
            /**
            while(fis.available() > 0){
                char ch = (char)fis.read();
                System.out.println(ch);
            }
             */
        } catch (IOException e){
            e.getStackTrace();
        }

    }
}
