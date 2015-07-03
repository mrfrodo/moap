package no.frodo.ws.client;

import no.frodo.ws.HelloService;

import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;


public class WebServiceClient{

    public static void main(String[] args) throws Exception {

        URL wsdlUrl = new URL("http://localhost:8080/moap/helloservice?wsdl");

        //qualifier name ...
        QName qname = new QName("http://ws.frodo.no/", "HelloServiceImplService");
        Service service = Service.create(wsdlUrl, qname);
        HelloService helloService = service.getPort(HelloService.class);
        System.out.println(helloService.printMessage());
    }
}