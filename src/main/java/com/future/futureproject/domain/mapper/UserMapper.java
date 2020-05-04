package com.future.futureproject.domain.mapper;

import com.future.futureproject.domain.entity.UserEntity;
import com.future.futureproject.domain.model.UserModel;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public abstract class UserMapper extends BaseObjectMapper<UserEntity, UserModel> {
}
