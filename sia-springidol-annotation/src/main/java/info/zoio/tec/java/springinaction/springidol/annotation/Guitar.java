package info.zoio.tec.java.springinaction.springidol.annotation;

/**
 * 使用自定义的限定器注解
 *
 * @author humyna
 *
 */

@StringedInstrument
public class Guitar implements Instrument {

	public Guitar() {
		// TODO Auto-generated constructor stub
	}

	public void play() {
		 System.out.println("Strum strum strum");
	}

}
