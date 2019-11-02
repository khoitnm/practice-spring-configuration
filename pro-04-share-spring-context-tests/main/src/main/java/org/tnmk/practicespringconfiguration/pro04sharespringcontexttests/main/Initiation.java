package org.tnmk.practicespringconfiguration.pro04sharespringcontexttests.main;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

@Service
public class Initiation {
    public static final Logger logger = LoggerFactory.getLogger(Initiation.class);

    @EventListener(ApplicationReadyEvent.class)
    public void initiate(){
        logger.info("Application finished starting");
    }
}
