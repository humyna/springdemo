package info.zoio.tec.java.springinaction.springidol.aspectj;

public class Instrumentalist implements Performer {

	public Instrumentalist() {
		// TODO Auto-generated constructor stub
	}

	public void perform() throws PerformanceException {
//		throw new PerformanceException();
		instrument.play();
	}

	private Instrument instrument;

	public Instrument getInstrument() {
		return instrument;
	}

	public void setInstrument(Instrument instrument) {
		this.instrument = instrument;
	}


}
