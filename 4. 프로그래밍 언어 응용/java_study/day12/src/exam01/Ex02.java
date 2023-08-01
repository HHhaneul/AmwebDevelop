package exam01;

import java.util.Vector;

public class Ex02 {
    public static void main(String[] args) {
        //공간을 여유롭게 만들어준다. 2배씩 큰 용량으로 생성
        Vector<String> names = new Vector<>(3);
        System.out.printf("현재 공간 : %d%n", names.capacity());
        names.add("이름1");
        names.add("이름2");
        names.add("이름3");
        System.out.printf("현재 공간 : %d%n", names.capacity());
        names.add("이름4");
        System.out.printf("현재 공간 : %d%n", names.capacity());
    }
}
