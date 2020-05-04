package com.future.futureproject.service.impl;

import com.future.futureproject.domain.mapper.TireMapper;
import com.future.futureproject.domain.entity.TireEntity;
import com.future.futureproject.domain.model.TireModel;
import com.future.futureproject.repository.TireRepository;
import com.future.futureproject.service.TireService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Objects;

@Service
@Transactional
public class TireServiceImpl implements TireService {

    @Autowired
    private TireRepository tireRepository;

    @Autowired
    private TireMapper tireMapper;

    @Override
    public TireModel selectById(Integer id) {
        if (Objects.isNull(id))
            return null;

        TireEntity tireEntity = tireRepository.findById(id).orElse(null);
        if (Objects.isNull(tireEntity))
            return null;


        return tireMapper.toModel(tireEntity);
    }

    @Override
    public TireModel save(TireModel model) {
        TireEntity entity = tireMapper.toEntity(model);
        if (Objects.isNull(entity)) {
            return null;
        }

        TireEntity savedObject = tireRepository.save(entity);
        if (Objects.isNull(savedObject)) {
            return null;
        }

        return tireMapper.toModel(savedObject);
    }

    @Override
    public void delete(String id) {

    }
}
