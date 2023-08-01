package exam01;

public class Outer {
    int num1 = 10;
    static int num2 = 20;

    public void method() {
    }

    static class Inner {
        void method(){
            System.out.println("정적 내부 클래스");
            num2 = 30;
//            내부 클래스에서 외부 클래스로 접근할 수는 없지만 외부 클래스의 정적 자원들은 내부클래스에서 접근할 수 있다.
        }
    }
}
