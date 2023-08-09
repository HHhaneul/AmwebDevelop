package exam01;

public class Ex01 {
    public static void main(String[] args) {
        long stime = System.nanoTime(); // 공통 추가 기능

        ImplCalculator cal1 = new ImplCalculator();
        long result1 = cal1.factorial(10);  // 핵심 기능
        System.out.println("cal1 값= " + result1);
        
        long etime = System.nanoTime(); // 공통 추가 기능
        System.out.println("cal1 걸린시간: " + (etime - stime));

        stime = System.nanoTime(); // 공통 추가 기능

        RecCalculator cal2 = new RecCalculator();
        long result2 = cal2.factorial(10); // 핵심 기능
        System.out.println("cal2 값= " + result2);

        etime = System.nanoTime(); // 공통 추가 기능
        System.out.println("cal2 걸린시간: " + (etime - stime));

    }
}
