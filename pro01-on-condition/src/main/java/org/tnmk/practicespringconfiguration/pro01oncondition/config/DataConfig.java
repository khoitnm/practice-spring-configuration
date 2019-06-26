package org.tnmk.practicespringconfiguration.pro01oncondition.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.List;

//To do this, we need https://docs.spring.io/spring-boot/docs/2.1.6.RELEASE/reference/html/configuration-metadata.html#configuration-metadata-annotation-processor
@Configuration
@ConfigurationProperties(prefix = "data-config")
public class DataConfig {
    private String[] myArrayData;

    private List<String> myListData;

    public String[] getMyArrayData() {
        return myArrayData;
    }

    public void setMyArrayData(String[] myArrayData) {
        this.myArrayData = myArrayData;
    }

    public List<String> getMyListData() {
        return myListData;
    }

    public void setMyListData(List<String> myListData) {
        this.myListData = myListData;
    }
}
