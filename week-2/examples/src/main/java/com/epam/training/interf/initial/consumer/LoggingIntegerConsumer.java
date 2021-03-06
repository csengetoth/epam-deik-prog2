package com.epam.training.interf.initial.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.epam.training.interf.initial.queue.AbstractQueue;

public class LoggingIntegerConsumer extends AbstractConsumer{

    private final static Logger LOGGER = LoggerFactory.getLogger(LoggingIntegerConsumer.class);

    public LoggingIntegerConsumer(AbstractQueue queue) {
        super(queue);
    }

    @Override
    protected void processNext(Integer item) {
        LOGGER.info("The next number is {}", item);
    }
}
