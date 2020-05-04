package com.future.futureproject.service;

import com.future.futureproject.domain.model.TireModel;

public interface TireService {
    TireModel save(TireModel model);

    TireModel selectById(Integer id);

    void delete(String id);

}
