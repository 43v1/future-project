package com.future.futureproject.domain.model;

import com.future.futureproject.domain.entity.TireBrandsEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TireBrandsModelsModel {

    private Integer id;

    private TireBrandsEntity brand;

    private String name;

}
