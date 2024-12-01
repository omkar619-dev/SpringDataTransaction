package com.javalover.dto;

import com.javalover.entity.Appointment;
import com.javalover.entity.Patient;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PatientAppointmentRequest {

    private Patient patient;
    private Appointment appointment;

}
