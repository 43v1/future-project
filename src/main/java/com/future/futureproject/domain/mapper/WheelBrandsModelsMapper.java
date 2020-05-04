package com.future.futureproject.domain.mapper;

import com.future.futureproject.domain.entity.WheelBrandsModelsEntity;
import com.future.futureproject.domain.model.WheelBrandsModelsModel;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring",uses = {WheelBrandsMapper.class})
public abstract class WheelBrandsModelsMapper extends BaseObjectMapper<WheelBrandsModelsEntity, WheelBrandsModelsModel> {
}
