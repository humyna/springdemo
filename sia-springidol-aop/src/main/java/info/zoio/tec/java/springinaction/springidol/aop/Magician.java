package info.zoio.tec.java.springinaction.springidol.aop;

public class Magician implements MindReader {
  private String thoughts;

  public void interceptThoughts(String thoughts) {
    System.out.println("Intercepting volunteer's thoughts");
    this.thoughts = thoughts;
  }

  public String getThoughts() {
	System.out.println("volunteer's thoughts:" + thoughts);
    return thoughts;
  }
}