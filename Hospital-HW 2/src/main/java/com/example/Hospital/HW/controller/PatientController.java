package com.example.Hospital.HW.controller;

import com.example.Hospital.HW.model.Patient;
import com.example.Hospital.HW.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/patient")
//http://localhost:8080/api/patient
public class PatientController {
    @Autowired
    PatientService patientService;

    @GetMapping()
    public List<Patient> getAllPatient() {
        return this.patientService.getPatientList();
    }

    @GetMapping("/{id}")
    public Patient getPatient(@PathVariable int id) {
        Patient patient = this.patientService.getPatient(id);
        return patient;
    }

    @PostMapping()
    public Patient createPatient(@RequestBody Patient patient) {
        Patient createPatient = this.patientService.createPatient(patient);
        return createPatient;
    }

    @PutMapping("/{id}")
    public Patient updatePatient(@PathVariable int id, @RequestBody Patient patient) {
        Patient updatePatient = this.patientService.updatePatient(id, patient);
        return updatePatient;
    }

    @DeleteMapping("/{id}")
    public Patient deletePatient(@PathVariable int id) {
        Patient deletePatient = this.patientService.deletePatient(id);
        return deletePatient;
    }
}




