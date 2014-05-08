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
//		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-idol.xml");//Setter注入
		ApplicationContext ctx = new ClassPathXmlApplicationContext("springidol-context-3.xml");//使用命名空间p装配属性
//		Performer performer = (Performer)ctx.getBean("kenny");
		Performer performer = (Performer)ctx.getBean("kenny2");
		performer.perform();
	}
}
