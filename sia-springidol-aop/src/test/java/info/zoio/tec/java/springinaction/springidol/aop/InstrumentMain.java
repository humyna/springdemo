package info.zoio.tec.java.springinaction.springidol.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 *在XML中声明切面：声明前置、后置、环绕通知
 *
 * @author humyna
 *
 */
public class InstrumentMain {

	public static void main(String[] args) throws PerformanceException {
//		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-idol.xml");//功能1：声明前置和后置通知
//		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-idol-2.xml");//功能2：提取相同的切点，并引用
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-idol-around.xml");//声明环绕通知
		Performer performer = (Performer)ctx.getBean("eddie");
		performer.perform();
	}
}
