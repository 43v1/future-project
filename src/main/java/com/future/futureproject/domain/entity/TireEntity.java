package com.future.futureproject.domain.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "tires")
public class TireEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "brand")
    private TireBrandsEntity brand;

    @ManyToOne
    @JoinColumn(name = "model")
    private TireBrandsModelsEntity model;

    @Column(name = "size")
    private Integer size;

    @Column(name = "width")
    private Integer width;

    @Column(name = "height")
    private Integer height;

    @Column(name = "speed_index")
    private String speedindex;

    @ManyToOne
    @JoinColumn(name = "season", referencedColumnName = "id")
    private SeasonEntity season;
}
