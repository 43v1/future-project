package com.future.futureproject.domain.model;

import com.future.futureproject.enums.AdType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AdTypeModel {

    private AdType id;

    private String name;
}
