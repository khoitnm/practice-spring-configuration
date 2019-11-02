package org.tnmk.practicespringconfiguration.pro04sharespringcontexttests.main;

import java.lang.invoke.MethodHandles;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SampleSharedServiceTestImpl {
    private static final Logger logger = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

    public String hello() {
        String message = "Hello TEST SampleSharedServiceImpl " + this;
        logger.info(message);
        return message;
    }
}
