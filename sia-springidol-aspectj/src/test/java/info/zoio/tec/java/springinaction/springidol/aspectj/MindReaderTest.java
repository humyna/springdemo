package info.zoio.tec.java.springinaction.springidol.aspectj;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration( { "file:src/main/resources/sneaky-magician.xml" })
public class MindReaderTest {
  @Autowired
  MindReader magician;

  @Autowired
  Thinker volunteer;

  //为通知传递参数
  @Test
  public void magicianShouldReadVolunteersMind() {
    volunteer.thinkOfSomething("Queen of Hearts");

    assertEquals("Queen of Hearts", magician.getThoughts());
  }
}
