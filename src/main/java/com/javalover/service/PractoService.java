package com.javalover.service;

import com.javalover.dto.PatientAppointmentRequest;
import com.javalover.entity.Appointment;
import com.javalover.entity.Patient;
import com.javalover.repository.AppointmentRepository;
import com.javalover.repository.PatientRepository;
import com.javalover.util.PromoCodeValidator;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
public class PractoService {
    @Autowired
    private PatientRepository patientRepository;
    @Autowired
    private AppointmentRepository appointmentRepository;

    @Transactional
    public String bookAppointment(PatientAppointmentRequest request){
        Patient patient = request.getPatient();
        long patientId = patientRepository.save(patient).getPatientId();

        //save appointment
        Appointment appointment = request.getAppointment();
        //validate user promocode
        if(appointment.getPromoCode() != null){
            PromoCodeValidator.validatePromoCode(appointment.getPromoCode());
        }
        appointment.setPatientId(patientId);
        String appointmentNo = appointmentRepository.save(appointment).getAppointmentId();
        return "Heya,HI " + patient.getName()+ "Your appointment booked successfully " + appointmentNo;

    }

//    @Transactional
//    public void addDoctorRating(){
//
//    }
//
//    public void rateHospitality(){}

}
