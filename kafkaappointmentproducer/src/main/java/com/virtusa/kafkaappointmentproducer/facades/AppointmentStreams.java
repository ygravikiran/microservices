package com.virtusa.kafkaappointmentproducer.facades;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

public interface AppointmentStreams {
	
    String OUTPUT = "appointment-out";
   
    @Output(OUTPUT)
    MessageChannel outboundAppointment();

}
