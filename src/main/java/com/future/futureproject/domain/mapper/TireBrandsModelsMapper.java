package com.future.futureproject.domain.mapper;

import com.future.futureproject.domain.entity.TireBrandsModelsEntity;
import com.future.futureproject.domain.model.TireBrandsModelsModel;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {TireBrandsMapper.class})
public abstract class TireBrandsModelsMapper extends BaseObjectMapper<TireBrandsModelsEntity, TireBrandsModelsModel> {
}
