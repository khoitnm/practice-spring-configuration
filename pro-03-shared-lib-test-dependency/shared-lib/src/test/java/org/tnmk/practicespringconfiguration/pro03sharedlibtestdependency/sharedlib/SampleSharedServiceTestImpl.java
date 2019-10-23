package org.tnmk.practicespringconfiguration.pro03sharedlibtestdependency.sharedlib;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.lang.invoke.MethodHandles;

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
