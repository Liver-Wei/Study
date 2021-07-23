package com.lw.mapper;

import com.lw.bean.User;
import com.lw.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @author Liver
 * @Description
 * @date 2021/7/19 16:07
 */
public class UserMapperTest {

    @Test
    public void getAllUser(){
        //获取sqlSession
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        List<User> userList = userMapper.getAllUser();
        for (User user : userList) {
            System.out.println(user.toString());
        }
        sqlSession.close();
    }
}
