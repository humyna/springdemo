package info.zoio.tec.java.springinaction.knights;

public class BraveKnight implements Knight {
	private Quest quest;

	//构造器注入
	public BraveKnight(Quest quest) {
		this.quest = quest;
	}

	public void embarkOnQuest() throws QuestException {
		quest.embark();
	}

}
