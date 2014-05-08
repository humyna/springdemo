package info.zoio.tec.java.springinaction.springidol;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * 构造器注入
 *
 * @author humyna
 *
 */
public class JugglerMain {

	public static void main(String[] args) throws PerformanceException {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-idol.xml");
//		ApplicationContext ctx = new ClassPathXmlApplicationContext("springidol-context-2.xml");//構造器注入
//		Performer performer = (Performer)ctx.getBean("duke");
		//构造注入对象引用
//		Performer performer = (Performer)ctx.getBean("poeicDuke");
		//Spring EL
		Performer performer = (Performer)ctx.getBean("carl");

		performer.perform();
	}

}
