package info.zoio.tec.java.springinaction.springidol;

/**
 * 通过setter方法注入
 *
 * @author humyna
 *
 */
public class Instrumentalist implements Performer {

	public Instrumentalist() {
		// TODO Auto-generated constructor stub
	}

	public void perform() throws PerformanceException {
		System.out.print("Playing " + song + " :");
		instrument.play();
	}

	private String song;

	public void setSong(String song) {
		this.song = song;
	}

	private Instrument instrument;

	public void setInstrument(Instrument instrument) {
		this.instrument = instrument;
	}

	public String getSong() {
		return song;
	}

	public Instrument getInstrument() {
		return instrument;
	}

}
