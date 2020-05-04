package com.future.futureproject.domain.entity;

import com.future.futureproject.enums.Material;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Data
@Entity
@Table(name = "materials", schema = "wheels_and_tires")
public class MaterialsEntity implements Serializable {

    @Id
    @Column(name = "id")
    @Enumerated(EnumType.STRING)
    private Material id;

    @Column(name = "name")
    private String name;

}
