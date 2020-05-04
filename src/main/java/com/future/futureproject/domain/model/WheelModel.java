package com.future.futureproject.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class WheelModel {
    private Integer id;
    private WheelBrandsModel brand;
    private WheelBrandsModelsModel model;
    private Integer size;
    private Double width;
    private Integer offset;
    private Double weight;
    private MaterialsModel material;
}
