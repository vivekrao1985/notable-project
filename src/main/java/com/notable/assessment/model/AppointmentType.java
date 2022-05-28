package com.notable.assessment.model;

import lombok.Getter;

public enum AppointmentType {

    NewPatient("New Patient"),
    FollowUp("Follow Up");

    @Getter
    private final String appointmentType;

    AppointmentType(final String appointmentType) {
        this.appointmentType = appointmentType;
    }
}
