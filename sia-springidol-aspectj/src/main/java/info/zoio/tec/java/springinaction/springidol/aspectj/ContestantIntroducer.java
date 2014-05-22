package info.zoio.tec.java.springinaction.springidol.aspectj;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;

@Aspect
public class ContestantIntroducer {
	@DeclareParents(value="info.zoio.tec.java.springinaction.springidol.aspectj.Performer+",
			defaultImpl = GraciousContestant.class)
	public static Contestant contestant;

}
