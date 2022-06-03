package com.wzhcode;

import com.wzhcode.mapper.UserMapper;
import com.wzhcode.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest(classes = {MybatisDemo01Application.class})
public class MybaisPlusTest {
    @Autowired
    private UserMapper userMapper;
    //爆红原因，由于扫描的是mapper接口，而装配的实际上是动态生成的代理类，这时还没有代理类所以报错
    //为了解决这个问题可以在mapper接口上标记一个@Repository,但是不写也不影响
    @Test
    public void testSelectList(){
        List<User> users = userMapper.selectList(null);//内置参数为条件查询器，如果没条件则写null
        users.forEach(System.out::println);
    }
}
