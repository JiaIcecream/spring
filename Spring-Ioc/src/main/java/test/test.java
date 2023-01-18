package test;

import com.liang.Pojo.User;
import com.liang.Service.UserDaoServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("src/main/resources/beans.xml");
		UserDaoServiceImpl userDaoServiceImpl = (UserDaoServiceImpl) context.getBean("userDaoServiceImpl");
		userDaoServiceImpl.getUser();

		User user = (User) context.getBean("user");
		User user2 = (User) context.getBean("user");
		System.out.println(user.toString());
		System.out.println(user==user2);
	}
}
