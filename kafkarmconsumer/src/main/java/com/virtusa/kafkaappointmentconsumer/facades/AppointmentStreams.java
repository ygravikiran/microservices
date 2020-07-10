package com.virtusa.kafkaappointmentconsumer.facades;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.MessageChannel;

public interface AppointmentStreams {
	
    String INPUT = "appointment-in";
   
    @Input(INPUT)
    MessageChannel inboundAppointment();

}
