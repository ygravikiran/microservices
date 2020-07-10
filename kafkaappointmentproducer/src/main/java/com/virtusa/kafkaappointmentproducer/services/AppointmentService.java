package com.virtusa.kafkaappointmentproducer.services;

import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;
import org.springframework.util.MimeTypeUtils;

import com.virtusa.kafkaappointmentproducer.facades.AppointmentStreams;
import com.virtusa.kafkaappointmentproducer.models.Appointment;
@Service
public class AppointmentService {
private final AppointmentStreams appointmentStreams;

	public AppointmentService(AppointmentStreams appointmentStreams)
	{
		this.appointmentStreams=appointmentStreams;
	}
	public boolean addAppointment(Appointment appointment)
	{
		//JPA code
		//skeleton
		//Notification
		MessageChannel messageChannel = appointmentStreams.outboundAppointment();
	       return  messageChannel.send(MessageBuilder
	                .withPayload(appointment)
	                .setHeader(MessageHeaders.CONTENT_TYPE, MimeTypeUtils.APPLICATION_JSON)
	                .build());

		
	}
	
}
