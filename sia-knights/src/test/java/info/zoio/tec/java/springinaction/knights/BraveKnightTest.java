package info.zoio.tec.java.springinaction.knights;

import static org.mockito.Mockito.*;
import info.zoio.tec.java.springinaction.knights.BraveKnight;
import info.zoio.tec.java.springinaction.knights.Quest;

import org.junit.Test;

public class BraveKnightTest {
	@Test
	public void knightShouldEmbarkOnQuest() {
		Quest mockQuest = mock(Quest.class);// 创建mock的Quest
		BraveKnight knight = new BraveKnight(mockQuest);
		knight.embarkOnQuest();
		verify(mockQuest, times(1)).embark();// TODO 了解mock
	}
}
