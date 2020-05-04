package com.future.futureproject.domain.mapper;

import com.future.futureproject.domain.entity.AdEntity;
import com.future.futureproject.domain.model.AdModel;
import org.mapstruct.AfterMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring", uses = {AdTypeMapper.class, TireMapper.class, WheelMapper.class, UserMapper.class})
public abstract class AdMapper extends BaseObjectMapper<AdEntity, AdModel> {

    @Mapping(source = "tireEntity", target = "tireModel")
    @Mapping(source = "wheelEntity", target = "wheelModel")
    @Mapping(source = "userEntity", target = "userModel")
    public abstract AdModel toModel(AdEntity adEntity);



    @AfterMapping
    public void afterToModel(@MappingTarget AdModel adModel, AdEntity adEntity) {

    }

    @AfterMapping
    public void afterToEntity(AdModel adModel, @MappingTarget AdEntity adEntity) {

    }

}
