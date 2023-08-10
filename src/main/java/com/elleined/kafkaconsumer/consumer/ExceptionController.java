package com.elleined.kafkaconsumer.consumer;

import org.apache.kafka.common.errors.SerializationException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionController {

    @ExceptionHandler(SerializationException.class)
    public void handleSerializationException(SerializationException e) {
        System.out.println(e.getMessage());
    }
}
