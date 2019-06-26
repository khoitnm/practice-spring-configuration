package org.tnmk.practicespringconfiguration.pro01conditionalconfig.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
@ConfigurationProperties(prefix = "data-config")
public class DataProperties {

    private List<String> listWithOneItem;

    private String[] servicesArray;

    private List<String> servicesList;

    /**
     * When we use {@link Value}, the {@link ConfigurationProperties#prefix()} will be ignored.
     */
    @Value("${data-config.services-list}")
    private String servicesListString;

    @Value("#{T(java.util.Arrays).asList('${data-config.services-list}')}")
    private List<String> servicesListParseByValueAnnotation;

    public String[] getServicesArray() {
        return servicesArray;
    }

    public void setServicesArray(String[] servicesArray) {
        this.servicesArray = servicesArray;
    }

    public List<String> getServicesList() {
        return servicesList;
    }

    public void setServicesList(List<String> servicesList) {
        this.servicesList = servicesList;
    }

    public List<String> getListWithOneItem() {
        return listWithOneItem;
    }

    public void setListWithOneItem(List<String> listWithOneItem) {
        this.listWithOneItem = listWithOneItem;
    }

    public String getServicesListString() {
        return servicesListString;
    }

    public void setServicesListString(String servicesListString) {
        this.servicesListString = servicesListString;
    }

    public List<String> getServicesListParseByValueAnnotation() {
        return servicesListParseByValueAnnotation;
    }

    public void setServicesListParseByValueAnnotation(List<String> servicesListParseByValueAnnotation) {
        this.servicesListParseByValueAnnotation = servicesListParseByValueAnnotation;
    }
}
