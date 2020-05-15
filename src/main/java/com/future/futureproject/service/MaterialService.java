package com.future.futureproject.service;

import com.future.futureproject.domain.model.MaterialsModel;
import com.future.futureproject.enums.Material;

public interface MaterialService {

    MaterialsModel selectById(Material id);
}
