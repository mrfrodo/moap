package no.frodo.ws.client;

import no.frodo.ws.HelloService;
import no.frodo.ws.HelloServiceImpl;
import org.junit.Before;
import org.junit.Test;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.Assert.assertEquals;

public class HelloServiceTest {

    HelloService helloService;

    @Before
    public void setUp() throws MalformedURLException {
        URL wsdlUrl = new URL("http://localhost:8080/moap/helloservice?wsdl");
        //qualifier name ...
        QName qname = new QName("http://ws.frodo.no/", "HelloServiceImplService");
        Service service = Service.create(wsdlUrl, qname);
        helloService = service.getPort(HelloService.class);
    }

    @Test
    public void testPrintMessage() {
        String message = helloService.printMessage();
        System.out.printf(message);
        assertEquals(message , "hello from hello service");
    }
}
