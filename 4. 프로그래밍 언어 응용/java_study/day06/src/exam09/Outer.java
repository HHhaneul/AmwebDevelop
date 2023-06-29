package exam09;

public class Outer {
    int num1 = 10;
    class Inner{
        int num1 = 20;
        static int num2 = 30;
        void method(){
            //System.out.println("인스턴스 내부 클래스");
            System.out.println(num1); // 20 Inner의 num1
            System.out.println(Outer.this.num1); // 10 Outer의 num1
            //outerMethod();
            // static은 정의할 수 없다. but JDK16부터는 가능~
            // Why? static은 정적이며 데이터 메모리 영역에 들어가기 때문에 처음부터 데이터 영역에 들어가는데... Inner는 호출 될 지 안될 지 모르기 때문...!
            // But JDK16 부터는 가능! 하지만 회사들은 JDK11을 가장 많이 사용.
        }
    }

    public void outerMethod(){
        System.out.println("outerMethod()");
    }
}
