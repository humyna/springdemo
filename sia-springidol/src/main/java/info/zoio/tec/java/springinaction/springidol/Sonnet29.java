package info.zoio.tec.java.springinaction.springidol;

public class Sonnet29 implements Poem {
	private static String LINES[] = {
		"小白兔，白又白",
		"两只耳朵竖起来",
		"又吃萝卜又吃菜",
		"蹦蹦跳跳真可爱"
	};

	public void recite() {
		// TODO Auto-generated method stub
		for(int i = 0;i < LINES.length;i++){
			System.out.println(LINES[i]);
		}
	}

}
