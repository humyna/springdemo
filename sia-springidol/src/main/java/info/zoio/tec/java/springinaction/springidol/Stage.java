package info.zoio.tec.java.springinaction.springidol;

/**
 * 单例类
 *
 * @author humyna
 *
 */
public class Stage {
	private Stage() {
	}

	//延迟加载实例
	private static class StateSingletonHolder {
		static Stage instance = new Stage();
	}

	//延时实例
	public static Stage getInstance(){
		return StateSingletonHolder.instance;
	}
}
