package com.future.futureproject.service.impl;

import com.future.futureproject.domain.model.WheelModel;
import com.future.futureproject.service.WheelService;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class WheelServiceImpl implements WheelService {

    @Override
    public WheelModel addWheel(WheelModel model) {
        return null;
    }

    @Override
    public void deleteWheel(String id) {

    }

    @Override
    public WheelModel updateWheel(WheelModel model) {
        return null;
    }
}
