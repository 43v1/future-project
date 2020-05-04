package com.future.futureproject.domain.entity;

import com.future.futureproject.enums.Season;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "season")
public class SeasonEntity implements Serializable {

    @Id
    @Column(name = "id")
    @Enumerated(EnumType.STRING)
    private Season id;

    @Column(name = "name")
    private String name;

}
