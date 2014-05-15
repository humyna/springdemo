package info.zoio.tec.java.springinaction.springidol.atinject;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.inject.Qualifier;

//使用JSR-330d的Qualifier創建自定義的限制器
@Target({ElementType.FIELD,ElementType.PARAMETER,ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Qualifier
public @interface StringedInstrument {

}
