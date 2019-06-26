package org.tnmk.practicespringconfiguration.pro01conditionalconfig.config.itemslist;

import java.util.List;
//
//@Service("itemsListProperties")
//@ConfigurationProperties(prefix = "items-list")
public class ItemsListProperties {

//    @Value("#{items-list.services}}")
    private Object object;

    private List<String> services;

    public List<String> getServices() {
        return services;
    }

    public void setServices(List<String> services) {
        this.services = services;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }
}
