package com.future.futureproject.domain.mapper;

import com.future.futureproject.domain.entity.SeasonEntity;
import com.future.futureproject.domain.model.SeasonModel;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public abstract class SeasonMapper extends BaseObjectMapper<SeasonEntity, SeasonModel> {
}
