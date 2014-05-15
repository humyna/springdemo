package info.zoio.tec.java.springinaction.springidol.atinject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * 自动检测Bean
 *
 * 操作说明：
 * 	1.删除Instrumentalist中的属性注解@StringedInstrument，执行程序会报错，因为有多个Bean实现了Instrument接口（Guitar和Piano）
 * 	2.添加@StringedInstrument注解，限制只加载Guitar，程序正常执行
 *
 * @author humyna
 *
 */
public class InstrumentMain {
	public static void main(String[] args) throws PerformanceException {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-idol.xml");
		Performer performer = (Performer)ctx.getBean("eddie");
		performer.perform();
	}
}
