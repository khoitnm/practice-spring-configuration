package org.tnmk.practicespringconfiguration.pro00simpleconfig.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
  @Bean("beanA")
  @ConfigurationProperties(prefix = "bean-a")
  public SimpleBean beanA() {
    return new SimpleBean();
  }

  @Bean("beanB")
  @ConfigurationProperties(prefix = "bean-b")
  public SimpleBean beanB() {
    return new SimpleBean();
  }
}
