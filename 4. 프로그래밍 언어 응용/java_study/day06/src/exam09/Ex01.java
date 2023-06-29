package exam09;

public class Ex01 {
    public static void main(String[] args){
        Outer out = new Outer();
        Outer.Inner in = out.new Inner();
        // Outer의 인스턴스 내부클래스 Inner 생성하기
        in.method();

    }
}
