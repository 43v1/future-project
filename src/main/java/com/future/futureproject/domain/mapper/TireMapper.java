package com.future.futureproject.domain.mapper;

import com.future.futureproject.domain.entity.TireEntity;
import com.future.futureproject.domain.model.TireModel;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {TireBrandsMapper.class, TireBrandsModelsMapper.class})
public abstract class TireMapper extends BaseObjectMapper<TireEntity, TireModel> {


}
