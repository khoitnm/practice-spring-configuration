package org.tnmk.practicespringconfiguration.pro03sharedlibtestdependency.sharedlib.sampleindependent;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import java.lang.invoke.MethodHandles;

/**
 * This class is used to illustrate an independent component.
 * <br/>
 * <p/>
 * <strong>
 * This bean will be initiated in BOTH real and testing running even though it is not configured in shared-lib-test
 * </strong>
 */
@Component
public class SampleIndependentComponent {
    private static final Logger logger = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

    @EventListener(ApplicationReadyEvent.class)
    public void sayYourself() {
        logger.info("Independent_" + System.nanoTime());
    }
}
