package info.zoio.tec.java.springinaction.springidol.aspectj;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/resources/spring-idol.xml")
public class AspectTest {
  @Autowired
  ApplicationContext context;

  //通过注解切面声明前置和后置通知[id=audience @spring-idol.xml]、声明环绕通知[id=audience1@spring-idol.xml]
  @Test
  public void audienceShouldApplaud() throws Exception {
    Performer eddie = (Performer) context.getBean("eddie");
    eddie.perform();
  }

  //通过注解切面引入新功能
  @Test
  public void eddieShouldBeAContestant() {
    Contestant eddie = (Contestant) context.getBean("eddie");
    eddie.receiveAward();
  }


}
