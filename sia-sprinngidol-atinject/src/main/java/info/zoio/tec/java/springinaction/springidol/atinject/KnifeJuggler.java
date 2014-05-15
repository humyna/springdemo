package info.zoio.tec.java.springinaction.springidol.atinject;

import java.util.HashSet;
import java.util.Set;

import javax.inject.Inject;
import javax.inject.Provider;

import org.springframework.stereotype.Component;

/**
 * Provider接口可以实现Bean引用的延迟注入以及注入Bean的多个实例等功能
 *
 * @author humyna
 *
 */
@Component
public class KnifeJuggler {

	private Set<Knife> knives;

	@Inject
	public KnifeJuggler(Provider<Knife> knifeProvider) {//參數中的Provider接口可以實現Bean引用的延遲注入以及諸如Bean的多個實例等功能
		knives = new HashSet<Knife>();
		for (int i=0; i < 5; i ++){
			knives.add(knifeProvider.get());
		}
	}

	public void setKnives(Set<Knife> knives) {
		this.knives = knives;
	}


}
