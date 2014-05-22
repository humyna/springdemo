package info.zoio.tec.java.springinaction.springidol.aop;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 通过切面引入新功能
 *
 * @author humyna
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/resources/spring-idol-introductions.xml")
public class AspectTest {
	@Autowired
	ApplicationContext context;

	@Test
	public void audienceShouldApplaud() throws Exception {
		Performer eddie = (Performer) context.getBean("eddie");
		eddie.perform();
	}

	//此处为新功能
	@Test
	public void eddieShouldBeAContestant() {
		Contestant eddie = (Contestant) context.getBean("eddie");
		eddie.receiveAward();
	}
}
