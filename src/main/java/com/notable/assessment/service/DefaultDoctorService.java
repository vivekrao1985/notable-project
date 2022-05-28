package com.notable.assessment.service;

import com.notable.assessment.model.Doctor;
import com.notable.assessment.repository.DoctorRepository;
import jakarta.inject.Singleton;

@Singleton
public class DefaultDoctorService implements DoctorService {

    private final DoctorRepository doctorRepository;

    public DefaultDoctorService(DoctorRepository doctorRepository) {
        this.doctorRepository = doctorRepository;
    }

    @Override
    public Iterable<Doctor> list() {
        return this.doctorRepository.findAll();
    }

    @Override
    public Doctor save(Doctor doctor) {
        if (doctor.getId() == null) {
            return this.doctorRepository.save(doctor);
        } else {
            return this.doctorRepository.update(doctor);
        }
    }
}
