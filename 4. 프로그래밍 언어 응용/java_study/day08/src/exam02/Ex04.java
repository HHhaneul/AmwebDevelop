package exam02;

import java.io.IOException;

public class Ex04 {
    public static void main(String[] args) {
        try(MyResource my = new MyResource()) {

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
