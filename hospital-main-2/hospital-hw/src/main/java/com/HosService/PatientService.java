package HosService;

import model.Patient;
import org.springframework.stereotype.Service;

import javax.swing.event.ListDataEvent;
import java.util.List;

@Service
public class PatientService {

    private List<Patient> patientList;


    public List<Patient> getALLLPatient() {
        return this.patientList;
    }

    public PatientService() {
        this.patientList.add(new Patient(1, "Kevin", 22));
        this.patientList.add(new Patient(2, "Jay", 23));
        this.patientList.add(new Patient(3, "Steve", 24));
        this.patientList.add(new Patient(4, "Kell", 28));
    }

    public Patient creatPatient(Patient patient) {
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
        for (Patient updatePatient : this.patientList
        ) {
            if (id == updatePatient.getId()) {
                updatePatient.setAge(patient.getAge());
                updatePatient.setName(patient.getName());
                return updatePatient;
            }
        }
        return null;
    }

    public Patient deletePatient(int id) {
        for (Patient deletePatient : this.patientList) {
            if (id == deletePatient.getId()) {
                this.patientList.remove(deletePatient);
                return deletePatient;
            }
        }
        return null;
    }


}

