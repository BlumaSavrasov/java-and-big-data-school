package enums;

public class httpCodeHandlerService {
    public void handleHttpCode(int code){
        HttpCodeEnum.findByCode(code).getHandler().handle();
    }

    public static void main(String[] args) {
        httpCodeHandlerService service = new httpCodeHandlerService();
        service.handleHttpCode(101);
        service.handleHttpCode(201);
        service.handleHttpCode(301);
        service.handleHttpCode(401);
        service.handleHttpCode(501);
    }
}
