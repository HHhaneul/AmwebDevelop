package exam03;

public class Ex01 {
    public static void main(String[] args){
        C c = new C();
        //A a = new C();
        //B b = new C();
        A ac = new C(); // 동일한 그릇에 담아도 내용물은 다르다. A 그릇에 C 내용물
        A ad = new D(); // 동일한 그릇에 담아도 내용물은 다르다. A 그릇에 D 내용물

        // 명시적 형 변환
        if (ad instanceof C){
        C c1 = (C) ad;
        }
        if (ac instanceof C){
            C c2 = (C) ac;
            System.out.println("numA=" + c2.numA + " numB=" + c2.numB + " numC=" + c2.numC);
        }
    }
}
