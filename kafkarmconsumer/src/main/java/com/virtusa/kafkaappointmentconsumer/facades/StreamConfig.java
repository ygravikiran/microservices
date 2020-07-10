package com.virtusa.kafkaappointmentconsumer.facades;

import org.springframework.cloud.stream.annotation.EnableBinding;

@EnableBinding(AppointmentStreams.class)
public class StreamConfig {
}
