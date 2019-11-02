package org.tnmk.practicespringconfiguration.pro04sharespringcontexttests.main;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tnmk.practicespringconfiguration.pro04sharespringcontexttests.main.sampledependent.SampleDependentComponent;

import java.lang.invoke.MethodHandles;

/**
 * NOTE: This class is in a different package with the main Spring Boot class `Pro04ShareSpringContextTestsApplication`.
 */
@Service
public class SampleSharedServiceImpl implements SampleSharedService {
    private static final Logger logger = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

    @Autowired
    private SampleDependentComponent sampleDependentComponent;

    @Override
    public String hello() {
        String message = "Hello Real SampleSharedServiceImpl " + sampleDependentComponent.sayYourself() + this;
        logger.info(message);
        return message;
    }
}
