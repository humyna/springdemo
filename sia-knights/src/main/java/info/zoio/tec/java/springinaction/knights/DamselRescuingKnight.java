package info.zoio.tec.java.springinaction.knights;

public class DamselRescuingKnight implements Knight {
	private RescueDamselQuest quest;

	public DamselRescuingKnight(RescueDamselQuest quest) {
		quest = new RescueDamselQuest();
	}

	public void embarkOnQuest() throws QuestException {
		quest.embark();
	}

}
