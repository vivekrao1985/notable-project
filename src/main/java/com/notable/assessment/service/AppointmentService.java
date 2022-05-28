package com.notable.assessment.service;

import com.notable.assessment.model.Appointment;
import io.micronaut.core.annotation.NonNull;

import java.util.Date;

public interface AppointmentService {
    Iterable<Appointment> list(@NonNull String doctorId, @NonNull Date date);
    void remove(@NonNull String appointmentId);
    Appointment save(Appointment appointment) throws Exception;
}
