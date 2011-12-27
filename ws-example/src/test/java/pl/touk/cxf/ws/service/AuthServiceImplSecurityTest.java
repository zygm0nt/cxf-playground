package pl.touk.cxf.ws.service;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import pl.touk.cxf.ws.model.Employee;

import javax.annotation.Resource;

/**
 * User: mcl
 * Date: 27/12/11
 * Time: 11:15
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:service-context-ws-security.xml"})
public class AuthServiceImplSecurityTest {

    @Resource
    private AuthService client;

    @Test
    public void shouldGetEmployee() throws Exception {
        Employee employee = client.getEmployee("0223938");
        Assert.assertEquals("Jan", employee.getFirstName());
        Assert.assertEquals("Kowalski", employee.getLastName());
        Assert.assertEquals("123124", employee.getGid());
    }
}
