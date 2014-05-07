package info.zoio.tec.java.springinaction.springidol;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * Setter注入
 * 同时展示了面向接口编程的优点：演奏不同的乐器...
 *
 * @author humyna
 *
 */
public class InstrumentMain {

	public static void main(String[] args) throws PerformanceException {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-idol.xml");
		Performer performer = (Performer)ctx.getBean("kenny");
		performer.perform();
	}
}
