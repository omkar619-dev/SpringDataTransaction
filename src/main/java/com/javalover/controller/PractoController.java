package com.javalover.controller;

import com.javalover.dto.PatientAppointmentRequest;
import com.javalover.service.PractoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/practo")
public class PractoController {

    @Autowired
    private PractoService service;
    @PostMapping("/bookAppointment")
    public String bookDoctorsAppointment(@RequestBody PatientAppointmentRequest request){
        return service.bookAppointment(request);

    }
}
