package com.notable.assessment.repository;

import com.notable.assessment.model.Doctor;
import io.micronaut.core.annotation.NonNull;
import io.micronaut.data.mongodb.annotation.MongoRepository;
import io.micronaut.data.repository.CrudRepository;

@MongoRepository
public interface DoctorRepository extends CrudRepository<Doctor, String> {

    @NonNull
    Iterable<Doctor> list();
}
