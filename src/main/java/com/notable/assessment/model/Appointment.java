package com.notable.assessment.model;

import io.micronaut.core.annotation.NonNull;
import io.micronaut.data.annotation.GeneratedValue;
import io.micronaut.data.annotation.Id;
import io.micronaut.data.annotation.MappedEntity;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import java.util.Date;

@MappedEntity
public class Appointment {

    @Id
    @GeneratedValue
    @Getter
    @Setter
    private String id;

    @NonNull
    @NotBlank
    @Getter
    @Setter
    private String doctorId;

    @NonNull
    @NotBlank
    @Getter
    @Setter
    private String patientFirstName;

    @NonNull
    @NotBlank
    @Getter
    @Setter
    private String patientLastName;

    @NonNull
    @NotBlank
    @Getter
    @Setter
    private Date appointmentDate;

    @NonNull
    @NotBlank
    @Getter
    @Setter
    private AppointmentType appointmentType;
}
