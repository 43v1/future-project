package com.future.futureproject.service;

import com.future.futureproject.enums.AdType;
import com.future.futureproject.domain.model.AdTypeModel;

public interface AdTypeService {

    AdTypeModel selectById(AdType id);

}
