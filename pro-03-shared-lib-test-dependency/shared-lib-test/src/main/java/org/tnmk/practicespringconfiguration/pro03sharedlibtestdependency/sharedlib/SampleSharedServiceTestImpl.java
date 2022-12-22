package org.tnmk.practicespringconfiguration.pro03sharedlibtestdependency.sharedlib;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.lang.invoke.MethodHandles;

/**
 * NOTE: This class is in a different package with the main Spring Boot class `Pro03SharedLibTestDependencyApplication`.
 */
@Primary
@Service
public class SampleSharedServiceTestImpl implements SampleSharedService {
    private static final Logger logger = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

    @Override
    public String hello() {
        String message = "Hello TEST in separated module. SampleSharedServiceImpl " + this;
        logger.info(message);
        return message;
    }
}