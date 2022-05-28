package com.notable.assessment.repository;

import com.notable.assessment.model.Appointment;
import io.micronaut.data.mongodb.annotation.MongoFindQuery;
import io.micronaut.data.mongodb.annotation.MongoRepository;
import io.micronaut.data.repository.CrudRepository;

import java.util.Date;

@MongoRepository
public interface AppointmentRepository extends CrudRepository<Appointment, String> {

    @MongoFindQuery("{\"doctorId\": :doctorId, \"appointmentDate\":{$gte: :fromDate, $lt: :toDate}}")
    Iterable<Appointment> queryAppointments(String doctorId, Date fromDate, Date toDate);
}
