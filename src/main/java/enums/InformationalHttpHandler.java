package enums;

public class InformationalHttpHandler implements HttpHandler {
    @Override
    public void handle() {
        System.out.println(" Handling the INFORMATIONAL http code");
    }
}
