package com.future.futureproject.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TireModel {
    private Integer id;
    private TireBrandsModel brand;
    private TireBrandsModelsModel model;
    private Integer width;
    private Integer height;
    private Integer size;
    private String speedindex;
    private SeasonModel season;
}
