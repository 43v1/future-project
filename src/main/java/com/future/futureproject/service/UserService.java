package com.future.futureproject.service;

import com.future.futureproject.domain.model.UserModel;

public interface UserService {
    UserModel save(UserModel model);

    UserModel selectById(Integer id);
}
