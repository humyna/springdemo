package info.zoio.tec.java.springinaction.springidol.aspectj;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Audience {
	@Pointcut("execution(* info.zoio.tec.java.springinaction.springidol.aspectj.Performer.perform(..))")
	public void performance(){

	}

	@Before("performance()")
	public void takeSeats() {
		System.out.println("[Audience]The audience is taking their seats.");
	}

	@Before("performance()")
	public void turnOffCellPhones() {
		System.out.println("[Audience]The audience is turning off their cellphones");
	}

	@AfterReturning("performance()")
	public void applaud() {
		System.out.println("[Audience]CLAP CLAP CLAP CLAP CLAP");
	}

	@AfterThrowing("performance()")
	public void demandRefund() {
		System.out.println("[Audience]Boo! We want our money back!");
	}
}
