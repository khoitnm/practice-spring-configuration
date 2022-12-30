package org.tnmk.practicespringconfiguration.pro00simpleconfig.config;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class SimpleService {
  private final BeanOnCondition beanOnCondition;

  @Autowired
  @Qualifier("beanA")
  private SimpleBean beanA;

  @Autowired
  @Qualifier("beanB")
  private SimpleBean beanB;

  @EventListener(ApplicationReadyEvent.class)
  public void test() {
    beanOnCondition.test();
    log.info(beanA.toString());
    log.info(beanA.toString());
  }

}
