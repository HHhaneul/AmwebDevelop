package exam02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex01 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("a.txt");
            fis.close();
        }
//        catch (FileNotFoundException e){
//            e.printStackTrace();
//        }
        catch (IOException e) {
            e.printStackTrace();
            try {
                fis.close();
            }catch (IOException e2){
                e2.printStackTrace();
            }
        }
    }
}
