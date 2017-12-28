import com.alibaba.fastjson.JSON;
import com.lee.carscheduling.model.User;
import com.lee.carscheduling.service.IUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.logging.Logger;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring-mybatis.xml" })
public class TestMybatis {
    private static Logger logger = Logger.getLogger(String.valueOf(TestMybatis.class));

    @Resource
    private IUserService userService = null;


    @Test
    public void test() {
        User user = userService.getUserByID(1);
        System.out.println(user.getUserName());
        // logger.info("值："+user.getUserName());
        logger.info(JSON.toJSONString(user));
    }
}
