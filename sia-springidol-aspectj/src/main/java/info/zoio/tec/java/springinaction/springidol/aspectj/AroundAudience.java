package info.zoio.tec.java.springinaction.springidol.aspectj;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class AroundAudience {
	@Pointcut("execution(* info.zoio.tec.java.springinaction.springidol.aspectj.Performer.perform(..))")
	public void performance() {
	}
	@Around("performance()")
	public void watchPerformance(ProceedingJoinPoint joinpoint) {
		try {
			System.out.println("[AroundAudience]The audience is taking their seats.");
			System.out.println("[AroundAudience]The audience is turning off their cellphones");
			long start = System.currentTimeMillis();

			joinpoint.proceed();

			long end = System.currentTimeMillis();
			System.out.println("[AroundAudience]CLAP CLAP CLAP CLAP CLAP");
			System.out.println("The performance took " + (end - start)
					+ " milliseconds.");
		} catch (Throwable t) {
			System.out.println("[AroundAudience]Boo! We want our money back!");
		}
	}

}
