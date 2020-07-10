package com.virtusa.kafkaappointmentproducer.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.virtusa.kafkaappointmentproducer.models.Appointment;
import com.virtusa.kafkaappointmentproducer.services.AppointmentService;

import net.minidev.json.JSONObject;

@RestController
public class AppointmentController {
    @Autowired
	private AppointmentService appointmentService;
	//saving the Appointment details
		@CrossOrigin("*")
		@PostMapping("/appointments")
		public @ResponseBody ResponseEntity<?> addAppointment(@RequestBody Appointment appointment)
		{
			JSONObject jsonObject=new JSONObject();
			jsonObject.put("message", "Appointment could not be made because customer id is invalid");
			
			if(this.appointmentService.addAppointment(appointment))
				return ResponseEntity.ok("Appointment Created");
			else
		    	return ResponseEntity.status(HttpStatus.EXPECTATION_FAILED).body(jsonObject);
		}
}
