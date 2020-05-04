package com.future.futureproject.service.impl;

import com.future.futureproject.domain.mapper.AdTypeMapper;
import com.future.futureproject.domain.entity.AdTypeEntity;
import com.future.futureproject.enums.AdType;
import com.future.futureproject.domain.model.AdTypeModel;
import com.future.futureproject.repository.AdTypeRepository;
import com.future.futureproject.service.AdTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Objects;

@Service
@Transactional
public class AdTypeServiceImpl implements AdTypeService {

    @Autowired
    private AdTypeRepository adTypeRepository;

    @Autowired
    private AdTypeMapper adTypeMapper;

    @Override
    public AdTypeModel selectById(AdType id) {
        if (Objects.isNull(id)) {
            return null;
        }

        AdTypeEntity entity = adTypeRepository.findById(id).orElse(null);
        if (Objects.isNull(entity)) {
            return null;
        }

        AdTypeModel model = adTypeMapper.toModel(entity);
        return model;
    }
}
