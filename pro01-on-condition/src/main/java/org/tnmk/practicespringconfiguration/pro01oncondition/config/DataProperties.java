package org.tnmk.practicespringconfiguration.pro01oncondition.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
@ConfigurationProperties(prefix = "data-config")
public class DataProperties {

    private List<String> listWithOneItem;

    private String[] servicesArray;

    private List<String> servicesList;

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
}
