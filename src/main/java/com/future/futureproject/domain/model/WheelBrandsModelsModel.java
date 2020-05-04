package com.future.futureproject.domain.model;

import com.future.futureproject.domain.entity.WheelBrandsEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class WheelBrandsModelsModel {
    private Integer id;


    private WheelBrandsEntity brand;


    private String name;
}

