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

        TireEntity entity = tireRepository.findById(id).orElse(null);
        if (Objects.isNull(entity))
            return null;

        return tireMapper.toModel(entity);
    }

    @Override
    public void delete(Integer id) {
        if (Objects.nonNull(id)) {
            tireRepository.deleteById(id);
        }
    }

    @Override
    public TireModel save(TireModel model) {
        if (Objects.isNull(model))
            return null;

        TireEntity entity = tireMapper.toEntity(model);
        TireEntity saved = tireRepository.save(entity);
        return tireMapper.toModel(saved);

    }

}
