package com.sky.service;

import com.sky.dto.UserLoginDTO;
import com.sky.entity.User;
import com.sky.vo.UserReportVO;

import java.time.LocalDate;

/**
 * @author yao
 * @version 1.1
 */
public interface UserService {
    /**
     * 微信登陆
     * @param userLoginDTO
     * @return
     */
    User wxLogin(UserLoginDTO userLoginDTO);

    /**
     *统计指定时间内用户数据
     *
     * @param begin
     * @param end
     * @return
     */

}
