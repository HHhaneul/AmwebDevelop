package exam02;

public class Bird extends Animal{
    @Override
    public void move() {
        System.out.println("두 날개로 날아다닌다!");
    }
    public void hunt(){
        System.out.println("벌레를 잡아먹는다.");
    }
}
