package com.notable.assessment.controller;

import com.notable.assessment.model.Doctor;
import com.notable.assessment.service.DoctorService;
import io.micronaut.core.annotation.NonNull;
import io.micronaut.http.HttpStatus;
import io.micronaut.http.annotation.*;
import io.micronaut.scheduling.TaskExecutors;
import io.micronaut.scheduling.annotation.ExecuteOn;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

@Controller("/doctor")
@ExecuteOn(TaskExecutors.IO)
public class DoctorController {

    private final DoctorService doctorService;

    DoctorController(DoctorService doctorService) {
        this.doctorService = doctorService;
    }

    @Get
    Iterable<Doctor> list() {
        return this.doctorService.list();
    }

    @Post
    @Status(HttpStatus.CREATED)
    Doctor save(@NonNull @NotNull @Valid Doctor doctor) {
        return this.doctorService.save(doctor);
    }

    @Put
    Doctor update(@NonNull @NotNull @Valid Doctor doctor) {
        return this.doctorService.save(doctor);
    }
}
