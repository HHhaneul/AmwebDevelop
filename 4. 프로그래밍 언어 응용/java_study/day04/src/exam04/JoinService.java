package exam04;

public class JoinService {

    private static JoinService instance;

    private JoinService(){
        System.out.println("회원 가입 기능");
    }

    // 필요할 때만 만들기 위함. 사정없이 만들면 데이터를 불필요하게 사용하게 됨.
    public static JoinService getInstance(){
        if(instance == null){
        instance = new JoinService();
        }
        return instance;
    }
}