package org.tnmk.practicespringconfiguration.pro03sharedlibtestdependency.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;
import org.tnmk.practicespringconfiguration.pro03sharedlibtestdependency.sharedlib.SampleSharedService;

@Service
public class SampleMainService {
    private final SampleSharedService sampleSharedService;

    @Autowired
    public SampleMainService(SampleSharedService sampleSharedService) {
        this.sampleSharedService = sampleSharedService;
    }

    @EventListener(ApplicationReadyEvent.class)
    public void initiate(){
        sampleSharedService.hello();
    }
}