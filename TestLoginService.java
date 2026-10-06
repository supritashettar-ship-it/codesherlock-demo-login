public class TestLoginService {

    public static void main(String[] args) {

        LoginService service = new LoginService();

        boolean result = service.login(
                "admin",
                "wrongpassword"
        );

        System.out.println("Login result: " + result);
    }
}