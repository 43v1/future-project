package com.future.futureproject.domain.mapper;

import com.future.futureproject.domain.entity.MaterialsEntity;
import com.future.futureproject.domain.model.MaterialsModel;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public abstract class MaterialMapper extends BaseObjectMapper<MaterialsEntity, MaterialsModel>{
}
