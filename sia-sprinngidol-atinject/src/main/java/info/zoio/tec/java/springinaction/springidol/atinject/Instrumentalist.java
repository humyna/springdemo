package info.zoio.tec.java.springinaction.springidol.atinject;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * 使用JSR-330的@Inject裝配Bean @Value装配简单的值，可以使用SpEL表达式
 * 以及使用自定义限制器@Qualifier
 *
 * @author humyna
 *
 */
@Component("eddie")
public class Instrumentalist implements Performer {
	public void perform() throws PerformanceException {
		System.out.print("Playing " + song + " : ");
		instrument.play();
	}

	@Inject
	@StringedInstrument
	private Instrument instrument;

	@Value("两只老鼠")
	private String song;

}
