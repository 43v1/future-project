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
    public AdModel addAd(AdModel model) {
        return null;
    }

    @Override
    public void deleteAd(String id) {

    }

    @Override
    public AdModel updateAd(AdModel model) {
        return null;
    }

    @Override
    public AdModel selectById(Integer id) {
        if (Objects.isNull(id))
            return null;

        AdEntity adEntity = adRepository.findById(id).orElse(null);
        if (Objects.isNull(adEntity))
            return null;


        return adMapper.toModel(adEntity);
    }
}
