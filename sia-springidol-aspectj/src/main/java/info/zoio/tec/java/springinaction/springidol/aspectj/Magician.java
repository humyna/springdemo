package info.zoio.tec.java.springinaction.springidol.aspectj;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Magician implements MindReader {
  private String thoughts;

  @Pointcut("execution(* info.zoio.tec.java.springinaction.springidol.aspectj.Thinker.thinkOfSomething(String)) && args(thoughts)")
  public void thinking(String thoughts){

  }

  @Before("thinking(thoughts)")
  public void interceptThoughts(String thoughts) {
    System.out.println("Intercepting volunteer's thoughts");
    this.thoughts = thoughts;
  }

  public String getThoughts() {
	System.out.println("volunteer's thoughts:" + thoughts);
    return thoughts;
  }
}