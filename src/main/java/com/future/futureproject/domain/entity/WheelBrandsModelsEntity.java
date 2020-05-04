package com.future.futureproject.domain.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;


@Data
@Entity
@Table(name = "wheel_brands_models", schema = "wheels_and_tires")
public class WheelBrandsModelsEntity implements Serializable {

    @Id
    @Column(name = "id")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "brand")
    private WheelBrandsEntity brand;

    @Column(name = "name")
    private String name;
}
