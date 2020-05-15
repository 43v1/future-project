package com.future.futureproject.service;

import com.future.futureproject.domain.model.WheelModel;

public interface WheelService {
    void delete(Integer id);

    WheelModel save(WheelModel model);

    WheelModel selectById(Integer id);
}
