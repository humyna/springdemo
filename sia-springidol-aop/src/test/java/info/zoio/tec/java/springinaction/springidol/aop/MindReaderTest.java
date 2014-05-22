package info.zoio.tec.java.springinaction.springidol.aop;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
/**
 * 1.在XML中聲明切面：為通知传递參數
 * 2.使用Spring junit，注意讀取配置文件的路徑的寫法
 *
 * @author humyna
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration( { "file:src/main/resources/sneaky-magician.xml" })
public class MindReaderTest {
  @Autowired
  MindReader magician;

  @Autowired
  Thinker volunteer;

  @Test
  public void magicianShouldReadVolunteersMind() {
    volunteer.thinkOfSomething("Queen of Hearts");

    assertEquals("Queen of Hearts", magician.getThoughts());
  }
}
