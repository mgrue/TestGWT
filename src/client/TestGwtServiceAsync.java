package client;

import com.google.gwt.user.client.rpc.AsyncCallback;

public interface TestGwtServiceAsync {
    void createCheckout(AsyncCallback<String> async);
}
