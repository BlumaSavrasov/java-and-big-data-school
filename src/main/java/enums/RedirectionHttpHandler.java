package enums;

public class RedirectionHttpHandler implements HttpHandler {
    @Override
    public void handle() {
        System.out.println("Handling the REDIRECTION http code");
    }
}
