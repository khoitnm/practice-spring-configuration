package org.tnmk.practicespringconfiguration.pro01conditionalconfig.config.itemslist;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PropertiesConfig {

    @Bean(name = "itemsListProperties")
    @ConfigurationProperties("items-list")
    public ItemsListProperties itemsListProperties() {
        return new ItemsListProperties();
    }
}
