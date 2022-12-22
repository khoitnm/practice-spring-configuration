package org.tnmk.practicespringconfiguration.pro02importdependencywithbean.sharedbeans;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import java.lang.invoke.MethodHandles;

@Component
public class SampleSharedBean {
  private static final Logger logger =
      LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

  private final String sampleConfigValue;

  public SampleSharedBean(@Value("${sample-config.value}") String sampleConfigValue) {
    this.sampleConfigValue = sampleConfigValue;
    logger.info("Constructor SampleSharedBean {}: {}", this, sampleConfigValue);
  }

  @EventListener(ApplicationReadyEvent.class)
  public void start() {
    logger.info("Start SampleSharedBean {}: {}", this, sampleConfigValue);
  }
}
