package com.future.futureproject.domain.mapper;

import org.mapstruct.InheritInverseConfiguration;

import java.util.List;

public abstract class BaseObjectMapper<E, M> {

    public abstract M toModel(E e);

    public abstract List<M> toModelList(List<E> eList);

    @InheritInverseConfiguration
    public abstract E toEntity(M m);

    @InheritInverseConfiguration
    public abstract List<E> toEntityList(List<M> mList);
}
