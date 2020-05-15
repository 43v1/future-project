package com.future.futureproject.service.impl;

import com.future.futureproject.domain.entity.SeasonEntity;
import com.future.futureproject.domain.mapper.SeasonMapper;
import com.future.futureproject.domain.model.SeasonModel;
import com.future.futureproject.enums.Season;
import com.future.futureproject.repository.SeasonRepository;
import com.future.futureproject.service.SeasonService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Objects;

public class SeasonServiceImpl implements SeasonService {

    @Autowired
    private SeasonRepository seasonRepository;

    @Autowired
    private SeasonMapper seasonMapper;

    @Override
    public SeasonModel selectById(Season id) {
        if (Objects.isNull(id)) {
            return null;
        }

        SeasonEntity entity = seasonRepository.findById(id).orElse(null);
        if (Objects.isNull(entity)) {
            return null;
        }

        SeasonModel model = seasonMapper.toModel(entity);
        return model;    }
}
