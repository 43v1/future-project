package com.future.futureproject.service;

import com.future.futureproject.domain.model.AdModel;

public interface AdService {
    AdModel addAd(AdModel model);

    void deleteAd(String id);

    AdModel updateAd(AdModel model);

    AdModel selectById(Integer id);
}
