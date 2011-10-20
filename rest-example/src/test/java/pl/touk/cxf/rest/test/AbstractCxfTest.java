package pl.touk.cxf.rest.test;


import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import pl.touk.cxf.rest.example.MyService;

/**
 * User: mcl
 * Date: 10/20/11 1:04 PM
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:/applicationContext.xml" })
public abstract class AbstractCxfTest {

	@Autowired
	@Qualifier("chatclient")
	protected MyService proxy;
}
