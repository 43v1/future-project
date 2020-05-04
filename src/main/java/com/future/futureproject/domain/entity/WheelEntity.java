package com.future.futureproject.domain.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "wheels")
public class WheelEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "brand")
    private WheelBrandsEntity brand;

    @ManyToOne
    @JoinColumn(name = "model")
    private WheelBrandsModelsEntity model;

    @Column(name = "size")
    private Integer size;

    @Column(name = "width")
    private Double width;

    @Column(name = "offset")
    private Integer offset;

    @Column(name = "weight")
    private Double weight;

    @ManyToOne
    @JoinColumn(name = "material")
    private MaterialsEntity material;

}
