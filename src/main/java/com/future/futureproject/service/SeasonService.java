package com.future.futureproject.service;

import com.future.futureproject.domain.model.SeasonModel;
import com.future.futureproject.enums.Season;

public interface SeasonService {
    SeasonModel selectById(Season id);
}
