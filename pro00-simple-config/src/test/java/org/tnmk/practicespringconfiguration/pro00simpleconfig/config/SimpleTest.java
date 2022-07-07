package org.tnmk.practicespringconfiguration.pro00simpleconfig.config;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.tnmk.practicespringconfiguration.pro00simpleconfig.Pro00SimpleConfigApplication;

@SpringBootTest(classes = Pro00SimpleConfigApplication.class)
public class SimpleTest extends BaseIntegrationTest {

  @Autowired
  private SimpleProperties simpleProperties;

  @Test
  public void testConditionalOnExpression() {
    Assertions.assertNotNull(simpleProperties.getValA());
    Assertions.assertNotNull(simpleProperties.getValB());
  }

}
