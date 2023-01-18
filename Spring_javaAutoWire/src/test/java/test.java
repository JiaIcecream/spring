import com.liang.config.javaConfig;
import com.liang.pojo.person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class test {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(javaConfig.class);
		person getPerson = (person) context.getBean("getPerson");
		System.out.println(getPerson.getName());
	}
}
