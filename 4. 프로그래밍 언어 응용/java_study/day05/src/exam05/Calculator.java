package exam05;

public interface Calculator {
    int num = 10; // public static final 추가 // 정적 상수
    int add(int num1, int num2); // public abstract 컴파일러가 자동 추가
                                    //접근제어자는 설정 불가
}
