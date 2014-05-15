package info.zoio.tec.java.springinaction.springidol.atinject;

import org.springframework.stereotype.Component;

@Component
@StringedInstrument
public class Guitar implements Instrument {
  public void play() {
    System.out.println("Strum strum strum");
  }
}