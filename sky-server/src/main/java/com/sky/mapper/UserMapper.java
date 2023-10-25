package com.sky.mapper;

import com.sky.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @author yao
 * @version 1.1
 */
@Mapper
public interface UserMapper {
    @Select("select * from user where openId = #{openId}")
    User getByOpenId(String openId);

    Long insert(User user);
}
