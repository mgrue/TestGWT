package server;

import client.TestGwtService;
import com.google.gwt.user.server.rpc.RemoteServiceServlet;

import javax.servlet.annotation.WebServlet;
import java.util.UUID;

@WebServlet(name = "TestGwtServlet", urlPatterns = {"/TestGWT/rpc/service"})
public class TestGwtServlet extends RemoteServiceServlet implements TestGwtService {


    @Override
    public String createCheckout() {
        System.out.println("********** CALL **********");
        return UUID.randomUUID().toString();
    }
}
