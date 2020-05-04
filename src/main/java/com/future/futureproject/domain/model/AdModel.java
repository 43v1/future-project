package com.future.futureproject.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AdModel {
    private Integer id;

    private AdTypeModel type;

    private TireModel tireModel;

    private WheelModel wheelModel;

    private UserModel userModel;

}
