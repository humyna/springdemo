package info.zoio.tec.java.springinaction.springidol;

import java.util.Map;

public class OneManBand implements Performer {
//	private Collection<Instrument> instruments; //装配List\Set\Array
//	public void setInstruments(Collection<Instrument> instruments) {
//		this.instruments = instruments;
//	}

	public OneManBand() {
		// TODO Auto-generated constructor stub
	}

//	public void perform() throws PerformanceException {
//		for (Instrument instrument : instruments) {
//			instrument.play();
//		}
//
//	}


	//装配Map集合
	private Map<String, Instrument> instruments;
	public void setInstruments(Map<String, Instrument> instruments) {
		this.instruments = instruments;
	}

	public void perform() throws PerformanceException {
		for (String key : instruments.keySet()) {
			System.out.print("key :" + key);
			Instrument instrument = instruments.get(key);
			instrument.play();
		}
	}

}
