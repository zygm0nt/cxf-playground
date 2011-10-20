package pl.touk.cxf.rest.example;


import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.junit.Assert;
import org.junit.Test;
import pl.touk.cxf.rest.test.AbstractCxfTest;

/**
 * User: mcl
 * Date: 10/20/11 1:07 PM
 */
public class MyServiceTest extends AbstractCxfTest {
    
    @Test
	public void testConnect() {
		Response resp = proxy.postData("raghu");
		Assert.assertTrue(resp.getStatus() == 200);
		System.out.println(resp.getEntity().toString());
	}

    @Test
	public void testOther() {
		String resp = proxy.abc("Tom");
		Assert.assertEquals("My name is Tom", resp);
	}
}
