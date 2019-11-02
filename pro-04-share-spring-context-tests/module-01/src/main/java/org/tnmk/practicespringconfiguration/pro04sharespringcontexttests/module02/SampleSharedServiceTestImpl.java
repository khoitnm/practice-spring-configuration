package org.tnmk.practicespringconfiguration.pro04sharespringcontexttests.module02;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.lang.invoke.MethodHandles;

/**
 * NOTE: This class is in a different package with the main Spring Boot class `Pro04ShareSpringContextTestsApplication`.
 */
@Primary
@Service
public class SampleSharedServiceTestImpl implements SampleSharedService {
    private static final Logger logger = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

    @Override
    public String hello() {
        String message = "Hello TEST SampleSharedServiceImpl " + this;
        logger.info(message);
        return message;
    }
}
