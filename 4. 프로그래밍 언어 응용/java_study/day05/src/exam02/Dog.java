package exam02;

public class Dog extends Animal {
    @Override
    public void move() {
        System.out.println("네 발로 뛰어다닌다.");
    }
    public void bark() {
        System.out.println("멍멍 짖는다!");
    }
}
