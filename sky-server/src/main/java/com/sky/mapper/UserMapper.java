package com.sky.mapper;

import com.sky.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

/**
 * @author yao
 * @version 1.1
 */
@Mapper
public interface UserMapper {
    @Select("select * from user where openId = #{openId}")
    User getByOpenId(String openId);

    Long insert(User user);

    @Select("select * from user where id = #{userId}")
    User getById(Long userId);
}
