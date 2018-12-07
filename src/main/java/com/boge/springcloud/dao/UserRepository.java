package com.boge.springcloud.dao;

import com.boge.springcloud.bean.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

/**
 * @Author zhangwenbo
 * @DATE 2018/12/6 - 12:25
 * @Description:
 */
@Service
public interface UserRepository extends JpaRepository<User,Long> {
}
