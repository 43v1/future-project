package com.future.futureproject.domain.mapper;

import com.future.futureproject.domain.entity.WheelEntity;
import com.future.futureproject.domain.model.WheelModel;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {WheelBrandsMapper.class, WheelBrandsModelsMapper.class})
public abstract class WheelMapper extends BaseObjectMapper<WheelEntity, WheelModel>{
}
