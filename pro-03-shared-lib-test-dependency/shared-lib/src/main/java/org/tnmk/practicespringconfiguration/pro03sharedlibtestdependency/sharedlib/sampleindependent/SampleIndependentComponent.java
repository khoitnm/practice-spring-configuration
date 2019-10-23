package org.tnmk.practicespringconfiguration.pro03sharedlibtestdependency.sharedlib.sampleindependent;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

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

    @EventListener(ApplicationReadyEvent.class)
    public String sayYourself() {
        return "Independent_" + System.nanoTime();
    }
}
