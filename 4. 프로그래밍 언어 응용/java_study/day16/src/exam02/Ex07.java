package exam02;

import java.io.*;

public class Ex07 {
    public static void main(String[] args) {
        long stime = System.nanoTime(); // 시작시간
        try(FileInputStream fis = new FileInputStream("java.compiler.zip");
            BufferedInputStream bis = new BufferedInputStream(fis);
            FileOutputStream fos = new FileOutputStream("copied2_java.compiler.zip");
            BufferedOutputStream bos = new BufferedOutputStream(fos)) {

            while (bis.available() > 0){
                bos.write(bis.read());
            }

        }catch (IOException e){
            e.printStackTrace();
        }

        long etime = System.nanoTime();

        System.out.println("걸린시간: " + (etime - stime));
    }
}
