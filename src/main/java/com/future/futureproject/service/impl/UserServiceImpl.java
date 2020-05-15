package com.future.futureproject.service.impl;

import com.future.futureproject.domain.entity.UserEntity;
import com.future.futureproject.domain.mapper.UserMapper;
import com.future.futureproject.domain.model.UserModel;
import com.future.futureproject.repository.UserRepository;
import com.future.futureproject.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Objects;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserModel save(UserModel model) {
        if (Objects.isNull(model))
            return null;

        UserEntity entity = userMapper.toEntity(model);
        UserEntity saved = userRepository.save(entity);
        return userMapper.toModel(saved);

    }

    @Override
    public UserModel selectById(Integer id) {
        if (Objects.isNull(id))
            return null;

        UserEntity entity = userRepository.findById(id).orElse(null);
        if (Objects.isNull(entity))
            return null;

        return userMapper.toModel(entity);
    }
}
