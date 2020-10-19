package enums;

public class SuccessHttpHandler implements HttpHandler {
    @Override
    public void handle() {
        System.out.println("Handling the SUCCESS http code");
    }
}
