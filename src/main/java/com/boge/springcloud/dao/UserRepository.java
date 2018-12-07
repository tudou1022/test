package com.boge.springcloud.dao;

import com.boge.springcloud.bean.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

/**
 * @Author zhangwenbo
 * @DATE 2018/12/6 - 12:25
 * @Description: 使用jpa JpaRepository实现普通增删改查
 */
@Service
public interface UserRepository extends JpaRepository<User,Long> {
}
