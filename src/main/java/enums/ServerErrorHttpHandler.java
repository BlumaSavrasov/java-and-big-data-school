package enums;
public class ServerErrorHttpHandler implements HttpHandler {
    @Override
    public void handle() {
        System.out.println("Handling the SERVER ERROR http code");
    }
}
