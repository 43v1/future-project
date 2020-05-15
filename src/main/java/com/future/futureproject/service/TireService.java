package com.future.futureproject.service;

import com.future.futureproject.domain.model.TireModel;

public interface TireService {
    void delete(Integer id);

    TireModel save(TireModel model);

    TireModel selectById(Integer id);
}
