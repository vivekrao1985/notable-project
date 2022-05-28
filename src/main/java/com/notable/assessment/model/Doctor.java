package com.notable.assessment.model;

import io.micronaut.core.annotation.NonNull;
import io.micronaut.data.annotation.GeneratedValue;
import io.micronaut.data.annotation.Id;
import io.micronaut.data.annotation.MappedEntity;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;

@MappedEntity
public class Doctor {

    @Id
    @GeneratedValue
    @Getter
    @Setter
    private String id;

    @NonNull
    @NotBlank
    @Getter
    @Setter
    private String firstName;

    @NonNull
    @NotBlank
    @Getter
    @Setter
    private String lastName;
}
