package com.fh.dao;

/**
 * Created by Administrator on 2017-09-11.
 */
import org.springframework.data.jpa.repository.JpaRepository;

import com.fh.model.User;

public interface UserDao extends JpaRepository<User, Long> {

}