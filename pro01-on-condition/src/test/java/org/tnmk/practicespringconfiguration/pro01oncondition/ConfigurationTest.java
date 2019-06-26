package org.tnmk.practicespringconfiguration.pro01oncondition;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.tnmk.practicespringconfiguration.pro01oncondition.config.DataProperties;
import org.tnmk.practicespringconfiguration.pro01oncondition.config.NotConfiguredServiceC;
import org.tnmk.practicespringconfiguration.pro01oncondition.config.ServiceArrayA;
import org.tnmk.practicespringconfiguration.pro01oncondition.config.ServiceListB;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Pro01OnConditionApplication.class)
public class ConfigurationTest {

    @Autowired
    private DataProperties dataProperties;

    @Autowired(required = false)
    private ServiceArrayA serviceArrayA;

    @Autowired(required = false)
    private ServiceListB serviceListB;

    @Autowired(required = false)
    private NotConfiguredServiceC notConfiguredServiceC;


    @Test
    public void testCanLoadListWithOneItem() {
        Assert.assertEquals("x", dataProperties.getListWithOneItem().get(0));
    }

    @Test
    public void testCanLoadArrayAndListFromConfiguration() {
        Assert.assertArrayEquals(new String[]{"a", "aa"}, dataProperties.getServicesArray());
        Assert.assertEquals(3, dataProperties.getServicesList().size());
    }

    @Test
    public void testConditionalOnExpression() {
        Assert.assertNotNull(serviceArrayA);

        Assert.assertNotNull(serviceListB);

        Assert.assertNull(notConfiguredServiceC);
    }

}
