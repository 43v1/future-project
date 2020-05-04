package com.future.futureproject.domain.mapper;

import com.future.futureproject.domain.entity.TireBrandsEntity;
import com.future.futureproject.domain.model.TireBrandsModel;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public abstract class TireBrandsMapper extends BaseObjectMapper<TireBrandsEntity, TireBrandsModel>{
}
