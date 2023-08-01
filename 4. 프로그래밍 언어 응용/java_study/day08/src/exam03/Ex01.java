package exam03;

public class Ex01 {
    public static void main(String[] args) {
        LoginService service = new LoginService();
        //try {
            service.login("user01", "1235");

        //} catch (UserIdIncorrectException | UserPwIncorrectException e){
        //    System.out.println(e.getMessage());
        //}
    }
}
