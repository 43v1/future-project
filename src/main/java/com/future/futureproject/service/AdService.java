package com.future.futureproject.service;

import com.future.futureproject.domain.model.AdModel;

public interface AdService {

    void delete(Integer id);

    AdModel save(AdModel model);

    AdModel selectById(Integer id);
}
