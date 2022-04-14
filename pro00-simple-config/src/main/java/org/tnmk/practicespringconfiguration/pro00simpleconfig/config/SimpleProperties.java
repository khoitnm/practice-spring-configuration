package org.tnmk.practicespringconfiguration.pro00simpleconfig.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Data
@Configuration
public class SimpleProperties {
  @Value("${simple.valA}")
  private String valA;

  @Value("${simple.valB:}")
  private String valB;

}
