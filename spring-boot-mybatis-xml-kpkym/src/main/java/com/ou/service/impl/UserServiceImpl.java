package com.ou.service.impl;

import com.ou.javaweb.bean.User;
import com.ou.javaweb.dao.UserMapper;
import com.ou.javaweb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author kpkym
 * Date: 2018-11-03 20:41
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper mapper;

    @Override
    public void insert(User user) {
        mapper.insert(user);
    }
}
