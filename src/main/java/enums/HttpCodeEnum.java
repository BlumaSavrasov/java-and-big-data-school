package enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum HttpCodeEnum {
    INFORMATIONAL(100,199,new InformationalHttpHandler()),
    SUCCESS(200,299,new SuccessHttpHandler()),
    REDIRECTION(300,399,new RedirectionHttpHandler()),
    CLIENT_ERROR(400,499,new ClientErrorHttpHandler()),
    SERVER_ERROR(500,599,new ServerErrorHttpHandler());
    private int min;
    private int max;
    private HttpHandler handler;

    public static HttpCodeEnum findByCode(int code){
        HttpCodeEnum[] enums = values();
        for (HttpCodeEnum anEnum : enums) {
            if(code>=anEnum.min&&code<=anEnum.max)
                return anEnum;
        }
        throw new IllegalStateException(code+"this code does not supported yet");
    }
}
