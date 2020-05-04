package com.future.futureproject.domain.model;

import com.future.futureproject.enums.Season;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SeasonModel {
    private Season id;
    private String name;
}
