package exam01;

import java.util.Queue;
import java.util.Stack;

public class Ex03 {
    public static void main(String[] args) {
        Stack<String> names = new Stack<>();
        names.push("이름1");
        names.push("이름2");
        names.push("이름3");
        names.push("이름4");
        names.push("이름5");

        System.out.println(names);
        System.out.println(names.pop());
        System.out.println(names);
        System.out.println(names.pop());
        System.out.println(names);
        System.out.println(names.pop());
        System.out.println(names);
    }
}
