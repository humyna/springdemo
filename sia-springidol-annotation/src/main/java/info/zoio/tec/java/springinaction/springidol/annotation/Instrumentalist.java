package info.zoio.tec.java.springinaction.springidol.annotation;

import org.springframework.beans.factory.annotation.Autowired;

public class Instrumentalist implements Performer{


	@Autowired
	@StringedInstrument
	private  Instrument instrument;//说明：当Spring装配instrument属性时，Spring会把所有可选择的乐器Bean缩小到只有被@StringedInstrument注解标注的Bean（Guitar）

	public Instrumentalist() {
		// TODO Auto-generated constructor stub
	}

	public void perform() throws PerformanceException {
		System.out.print("Playing " + song + " : ");
	    instrument.play();
	}

	private String song;

	/*public Instrument getInstrument() {
		return instrument;
	}

	public void setInstrument(Instrument instrument) {
		this.instrument = instrument;
	}*/

	public String getSong() {
		return song;
	}

	public void setSong(String song) {
		this.song = song;
	}
}
