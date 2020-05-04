package com.future.futureproject.domain.entity;

import com.future.futureproject.enums.AdType;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "ads_type", schema = "wheels_and_tires")
public class AdTypeEntity implements Serializable {

    @Id
    @Column(name = "id")
    @Enumerated(EnumType.STRING)
    private AdType id;

    @Column(name = "name")
    private String name;

}
