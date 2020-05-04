package com.future.futureproject.service.impl;

import com.future.futureproject.domain.model.UserModel;
import com.future.futureproject.service.UserService;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class UserServiceImpl implements UserService {
    @Override
    public UserModel registerUser(UserModel model) {
        return null;
    }
}
