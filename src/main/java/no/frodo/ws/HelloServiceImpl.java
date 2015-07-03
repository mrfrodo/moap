package no.frodo.ws;

import javax.jws.WebService;

@WebService(endpointInterface = "no.frodo.ws.HelloService")
public class HelloServiceImpl implements HelloService{

    @Override
    public String printMessage() {
        return "hello from hello service";
    }

}