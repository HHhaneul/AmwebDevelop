package exam01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Ex01 {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("a.txt");
            // throw new FileNotFoundException(....);

        } catch (FileNotFoundException e) { // FileNotFoundException e = new FileNotFoundException(...)

            //System.out.println(e.getMessage());
            e.printStackTrace();
            System.out.println("예외 처리");
        }
    }
}
