package com.future.futureproject.service;

import com.future.futureproject.domain.model.WheelModel;

public interface WheelService {
    WheelModel addWheel(WheelModel model);
    void deleteWheel(String id);
    WheelModel updateWheel(WheelModel model);
}
