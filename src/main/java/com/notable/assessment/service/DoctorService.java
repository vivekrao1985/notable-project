package com.notable.assessment.service;

import com.notable.assessment.model.Doctor;

public interface DoctorService {
    Iterable<Doctor> list();
    Doctor save(Doctor doctor);
}
