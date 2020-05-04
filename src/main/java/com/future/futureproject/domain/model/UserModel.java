package com.future.futureproject.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserModel {
    private Integer id;

    private String username;

    @ToString.Exclude
    private String password;

    private String email;

    private String firstName;

    private String lastName;

    private String gender;

    private Integer age;

}
