package com.future.futureproject.domain.model;

import com.future.futureproject.enums.Material;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MaterialsModel {

    private Material id;

    private String name;
}
