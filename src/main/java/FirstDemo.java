import com.alibaba.fastjson.JSON;
import entity.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by jam on 2017/4/17.
 */
public class FirstDemo {



    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationConext.xml");
        Person bean = applicationContext.getBean(Person.class);
        System.out.println(JSON.toJSONString(bean));
    }
}
