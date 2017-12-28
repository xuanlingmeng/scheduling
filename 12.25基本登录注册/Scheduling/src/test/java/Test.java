import com.lee.scheduling.dao.IUserDao;
import com.lee.scheduling.model.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    private static ApplicationContext ac;
    static {
        ac = new ClassPathXmlApplicationContext("applicationContext.xml");
    }

    public static void main(String[] args) {
        IUserDao mapper = (IUserDao) ac.getBean("IUserDao");
        System.out.println("获取alvin");
        User user = mapper.selectByName("zhang");

        System.out.println(user.getId()+":"+"username:"+user.getUsername());
        System.out.println("password:"+user.getPassword());

    }
}