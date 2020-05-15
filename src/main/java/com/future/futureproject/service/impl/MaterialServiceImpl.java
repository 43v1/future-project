package com.future.futureproject.service.impl;

import com.future.futureproject.domain.entity.MaterialsEntity;
import com.future.futureproject.domain.mapper.MaterialMapper;
import com.future.futureproject.domain.model.MaterialsModel;
import com.future.futureproject.enums.Material;
import com.future.futureproject.repository.MaterialRepository;
import com.future.futureproject.service.MaterialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Objects;

@Service
@Transactional
public class MaterialServiceImpl implements MaterialService {

    @Autowired
    private MaterialRepository materialRepository;

    @Autowired
    private MaterialMapper materialMapper;

    @Override
    public MaterialsModel selectById(Material id) {
        if (Objects.isNull(id)) {
            return null;
        }

        MaterialsEntity entity = materialRepository.findById(id).orElse(null);
        if (Objects.isNull(entity)) {
            return null;
        }

        MaterialsModel model = materialMapper.toModel(entity);
        return model;
    }
}
