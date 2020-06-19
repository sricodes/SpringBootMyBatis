package com.freecharge.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
    int id;
    @NotNull(message = "Name field can't be null ")
    @NotBlank(message = "Name can't be blank")
    String name;
    @Email
    String email_address;
    @Positive
    double salary;
    String gender;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
