package com.future.futureproject.domain.mapper;

import com.future.futureproject.domain.entity.WheelBrandsEntity;
import com.future.futureproject.domain.model.WheelBrandsModel;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public abstract class WheelBrandsMapper extends BaseObjectMapper<WheelBrandsEntity, WheelBrandsModel> {
}
