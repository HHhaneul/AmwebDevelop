package exam05;

public class Ex01 {
    public static void main(String[] args){
        Calculator cal = new SimpleCalculator();
        int result = cal.add(10, 20);
        System.out.println(result);

        System.out.println(Calculator.num); // 정적 상수 num의 값을 변경할 수 없다.
    }
}
