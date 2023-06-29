package exam08;

public class Ex01 implements A, B{
    @Override
    public void method1() {

    }

    @Override
    public void method2() {
        System.out.println("실행!");
        // A, B의 인터페이스에 method2가 둘 다 있음에도 추상클래스에는 상관 X
        // 어차피 호출은 Ex01의 method2()가 실행이 된다.
    }

    @Override
    public void method3() {

    }
}
