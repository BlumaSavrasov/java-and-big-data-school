package enums;

public class ClientErrorHttpHandler implements HttpHandler {
    @Override
    public void handle() {
        System.out.println("Handling the CLIENT ERROR http code");
    }
}
