package pl.touk.cxf.ws.security;

import org.apache.ws.security.WSPasswordCallback;

import javax.security.auth.callback.Callback;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.callback.UnsupportedCallbackException;
import java.io.IOException;
import java.util.ResourceBundle;

/**
 * User: mcl
 * Date: 27/12/11
 * Time: 12:15
 */
public class ClientPasswordCallback implements CallbackHandler {

    private static final String BUNDLE_LOCATION = "pl.touk.auth.authClient";
    private static final String PASSWORD_PROPERTY_NAME = "auth.manager.password";

    private static String password;
    static {
        final ResourceBundle bundle = ResourceBundle.getBundle(BUNDLE_LOCATION);
        password = bundle.getString(PASSWORD_PROPERTY_NAME);
    }

    public void handle(Callback[] callbacks) throws IOException, UnsupportedCallbackException {

        WSPasswordCallback pc = (WSPasswordCallback) callbacks[0];

        // set the password for our message.
        pc.setPassword(password);
    }

}