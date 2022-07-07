package org.tnmk.practicespringconfiguration.pro00simpleconfig.config;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SimpleService {
  private final BeanOnCondition beanOnCondition;

  @EventListener(ApplicationReadyEvent.class)
  public void test() {
    beanOnCondition.test();
  }

}
