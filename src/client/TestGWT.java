package client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;

public class TestGWT implements EntryPoint {
    public void onModuleLoad() {

        final Label label = new Label();

        final Button button = new Button("Call__");
        button.addClickHandler(event -> {
                 call(label);
        });


        RootPanel.get().add(button);
        RootPanel.get().add(label);

        //call(label);
    }

    private void call(Label label) {
        final TestGwtServiceAsync service = GWT.create(TestGwtService.class);
        service.createCheckout(new AsyncCallback<String>() {
            @Override
            public void onFailure(Throwable caught) {
                Window.alert("ERROR");
            }

            @Override
            public void onSuccess(String result) {
                GWT.log("success " + result);
                label.setText(result);
            }
        });
    }
}
