package org.tnmk.practicespringconfiguration.pro00simpleconfig.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@ConditionalOnProperty(
    name = "abc.def"
    , havingValue = "true"
)
public class BeanOnCondition {

  public void test() {
    log.info("Trigger bean on condition");
  }
}
