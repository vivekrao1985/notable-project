package com.notable.assessment.controller;

import com.notable.assessment.model.Appointment;
import com.notable.assessment.service.AppointmentService;
import io.micronaut.core.annotation.NonNull;
import io.micronaut.core.convert.format.Format;
import io.micronaut.http.HttpStatus;
import io.micronaut.http.annotation.*;
import io.micronaut.scheduling.TaskExecutors;
import io.micronaut.scheduling.annotation.ExecuteOn;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Controller("/appointment")
@ExecuteOn(TaskExecutors.IO)
public class AppointmentController {

    private final AppointmentService appointmentService;

    AppointmentController(AppointmentService appointmentService) {
        this.appointmentService = appointmentService;
    }

    @Get("/doctor/{doctorId}/date/{date}")
    Iterable<Appointment> list(@PathVariable String doctorId, @PathVariable @Format("yyyy-MM-dd") Date date) {
        return this.appointmentService.list(doctorId, date);
    }

    @Delete("/delete/{id}")
    void remove(@PathVariable String id) {
        this.appointmentService.remove(id);
    }

    @Post
    @Status(HttpStatus.CREATED)
    Appointment save(@NonNull @NotNull @Valid Appointment appointment) throws Exception {
        return this.appointmentService.save(appointment);
    }
}
