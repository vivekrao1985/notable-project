package com.notable.assessment.service;

import com.notable.assessment.model.Appointment;
import com.notable.assessment.repository.AppointmentRepository;
import io.micronaut.core.annotation.NonNull;
import jakarta.inject.Singleton;
import org.joda.time.LocalDateTime;

import java.util.Date;

@Singleton
public class DefaultAppointmentService implements AppointmentService {

    private final AppointmentRepository appointmentRepository;

    public DefaultAppointmentService(AppointmentRepository appointmentRepository) {
        this.appointmentRepository = appointmentRepository;
    }

    @Override
    public Iterable<Appointment> list(@NonNull String doctorId, @NonNull Date date) {
        final Date toDate = LocalDateTime.fromDateFields(date).plusDays(1).toDate();
        return this.appointmentRepository.queryAppointments(doctorId, date, toDate);
    }

    @Override
    public void remove(@NonNull String appointmentId) {
        this.appointmentRepository.deleteById(appointmentId);
    }

    @Override
    public Appointment save(Appointment appointment) {
        return this.appointmentRepository.save(appointment);
    }
}
