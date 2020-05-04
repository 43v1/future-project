package com.future.futureproject.service.impl;

import com.future.futureproject.domain.mapper.AdMapper;
import com.future.futureproject.domain.entity.AdEntity;
import com.future.futureproject.domain.model.AdModel;
import com.future.futureproject.repository.AdRepository;
import com.future.futureproject.service.AdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Objects;

@Service
@Transactional
public class AdServiceImpl implements AdService {

    @Autowired
    private AdRepository adRepository;

    @Autowired
    private AdMapper adMapper;

    @Override
    public void delete(Integer id) {
        if (Objects.nonNull(id)) {
            adRepository.deleteById(id);
        }
    }

    @Override
    public AdModel save(AdModel model) {
        if (Objects.isNull(model))
            return null;

        AdEntity entity = adMapper.toEntity(model);
        AdEntity saved = adRepository.save(entity);
        return adMapper.toModel(saved);
    }

    @Override
    public AdModel selectById(Integer id) {
        if (Objects.isNull(id))
            return null;

        AdEntity entity = adRepository.findById(id).orElse(null);
        return adMapper.toModel(entity) ;
    }
}
