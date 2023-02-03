package server;

import client.TestGwtService;
import com.google.gwt.user.server.rpc.RemoteServiceServlet;

import javax.servlet.annotation.WebServlet;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

@WebServlet(name = "TestGwtServlet", urlPatterns = {"/TestGWT/rpc/service"})
public class TestGwtServlet extends RemoteServiceServlet implements TestGwtService {


    @Override
    public String createCheckout() {
        System.out.println("********** CALL **********");
        return UUID.randomUUID().toString();
    }

    private String getFormattedDate() {
        final SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return fmt.format(new Date());
    }
}
