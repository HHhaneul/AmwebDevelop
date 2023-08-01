package exam02;

public class Ex05 {
    public static void main(String[] args) {
        A a = new A(){
            public static void method(){
                System.out.println("수정!");
                // 기존 메서드를 변경할 수 있다. 하지만 public 이 아니라면? 안댐
            }
        };
        a.method();
    }
}
