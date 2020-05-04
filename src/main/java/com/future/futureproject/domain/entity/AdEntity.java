package com.future.futureproject.domain.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "ads")
public class AdEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "type")
    private AdTypeEntity type;

    @ManyToOne
    @JoinColumn(name = "tire")
    private TireEntity tireEntity;

    @ManyToOne
    @JoinColumn(name = "wheel")
    private WheelEntity wheelEntity;

    @ManyToOne
    @JoinColumn(name = "user")
    private UserEntity userEntity;
}

