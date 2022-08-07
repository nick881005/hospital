package com.example.Hospital.HW.service;

import com.example.Hospital.HW.model.Patient;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service


public class PatientService {

    private List<Patient> patientList;

    public List<Patient> getPatientList() {
        return this.patientList;
    }

    public PatientService() {
        this.patientList = new ArrayList<>();
        this.patientList.add(new Patient(1, "Kelly", 30));
        this.patientList.add(new Patient(2, "Nick", 32));
        this.patientList.add(new Patient(3, "Joe", 11));
        this.patientList.add(new Patient(4, "Kevin", 80));
        this.patientList.add(new Patient(5, "Ash", 40));
    }

    public Patient createPatient(Patient patient) {
        this.patientList.add(patient);
        return patient;
    }

    public Patient getPatient(int id) {
        for (Patient patient : this.patientList) {
            if (id == patient.getId()) {
                return patient;
            }
        }
        return null;
    }

    public Patient updatePatient(int id, Patient patient) {
        for (Patient updatePatient : this.patientList) {
            if (id == updatePatient.getId()) {
                updatePatient.setAge(patient.getAge());
                updatePatient.setName(patient.getName());
                return updatePatient;
            }
        }
        return null;
    }

    public Patient deletePatient(int id){
        for (Patient deletePatient : this.patientList){
            if (id == deletePatient.getId()){
                this.patientList.remove(deletePatient);
                return deletePatient;

            }
        }
        return null;
    }
}
