package com.virtusa.kafkaappointmentconsumer.listeners;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;

import com.virtusa.kafkaappointmentconsumer.dto.Appointment;
import com.virtusa.kafkaappointmentconsumer.facades.AppointmentStreams;

@EnableBinding(AppointmentStreams.class)
public class AppointmentListener {
	 @StreamListener(target = AppointmentStreams.INPUT)
	    public void handleBeneficiaries(@Payload Appointment appointment) {
	     System.out.println("invoked.....");   
		 System.out.println("Received appointment details:"+appointment);
	    }
}
