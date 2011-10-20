package pl.touk.cxf.rest.example;

import java.util.Dictionary;
import java.util.Hashtable;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import pl.touk.cxf.rest.example.provider.MessageWriterProvider;

public class Activator implements BundleActivator {

    public void start(BundleContext context) throws Exception {
        System.out.println("TEST");
        Dictionary<String, String> restProps = new Hashtable<String, String>();

        restProps.put("service.exported.interfaces", "*");
        restProps.put("service.exported.configs", "org.apache.cxf.rs");
        restProps.put("service.exported.intents", "HTTP");
        restProps.put("org.apache.cxf.rs.provider", MessageWriterProvider.class.getName());
        restProps.put("org.apache.cxf.rs.address", "http://localhost:8080/");
        context.registerService(MyService.class.getName(), new MyServiceImpl(), restProps);
    }

    public void stop(BundleContext context) throws Exception {
        //
    }
}