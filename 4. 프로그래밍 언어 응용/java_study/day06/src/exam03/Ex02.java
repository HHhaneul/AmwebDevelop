package exam03;
// instanceof 그릇을 뺀 후 다시 넣기!
public class Ex02 {
    public static void main(String[] args){
        A a = new C();
        System.out.println(a instanceof A); // true
        System.out.println(a instanceof B); // true
        System.out.println(a instanceof C); // true

        System.out.println(a instanceof D); // false
    }
}
