package com.future.futureproject.domain.mapper;

import com.future.futureproject.domain.entity.AdTypeEntity;
import com.future.futureproject.domain.model.AdTypeModel;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public abstract class AdTypeMapper extends BaseObjectMapper<AdTypeEntity, AdTypeModel> {

}
