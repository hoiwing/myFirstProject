package test;

import domain.User;
import org.junit.Test;
import org.springframework.jdbc.core.JdbcTemplate;
import service.UserService;
import service.impl.UserServiceImpl;
import util.JDBCUtils;

import java.util.List;
import java.util.Map;

public class testJDBC {

    private JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSource());

    @Test
    public void test1() {

        String sql = "select * from user";
        List<Map<String, Object>> lists = template.queryForList(sql);
        for (Map<String, Object> stringObjectMap : lists) {
            System.out.println(stringObjectMap);
        }
    }
    @Test
    public void test2(){
        String sql = "update user set qq = 111 where id = 1001";
        int count = template.update(sql);
        System.out.println(count);
    }

    @Test
    public void test3(){
        User user = new User(1,"张三","男",13,"陕西","12345","zhangsan@itcast.cn","zhangsan","123");
        UserService service = new UserServiceImpl();
        User loginUser = service.login(user);
        System.out.println(loginUser);
    }
}
