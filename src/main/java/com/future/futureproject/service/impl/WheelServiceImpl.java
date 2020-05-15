package com.future.futureproject.service.impl;

import com.future.futureproject.domain.entity.WheelEntity;
import com.future.futureproject.domain.mapper.WheelMapper;
import com.future.futureproject.domain.model.WheelModel;
import com.future.futureproject.repository.WheelRepository;
import com.future.futureproject.service.WheelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Objects;

@Service
@Transactional
public class WheelServiceImpl implements WheelService {

    @Autowired
    private WheelRepository wheelRepository;

    @Autowired
    private WheelMapper wheelMapper;

    @Override
    public void delete(Integer id) {

    }

    @Override
    public WheelModel save(WheelModel model) {
        if (Objects.isNull(model))
            return null;

        WheelEntity entity = wheelMapper.toEntity(model);
        WheelEntity saved = wheelRepository.save(entity);
        return wheelMapper.toModel(saved);

    }

    @Override
    public WheelModel selectById(Integer id) {
        if (Objects.isNull(id))
            return null;

        WheelEntity entity = wheelRepository.findById(id).orElse(null);
        if (Objects.isNull(entity))
            return null;

        return wheelMapper.toModel(entity);
    }
}
