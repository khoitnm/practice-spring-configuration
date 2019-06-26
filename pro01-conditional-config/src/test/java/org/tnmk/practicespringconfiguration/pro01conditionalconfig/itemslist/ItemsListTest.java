package org.tnmk.practicespringconfiguration.pro01conditionalconfig.itemslist;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.tnmk.practicespringconfiguration.pro01conditionalconfig.Pro01ConditionalConfigApplication;
import org.tnmk.practicespringconfiguration.pro01conditionalconfig.config.itemslist.ItemsListProperties;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Pro01ConditionalConfigApplication.class)
public class ItemsListTest {

    @Autowired
    @Qualifier("itemsListProperties")
    private ItemsListProperties itemsListProperties;




    @Test
    public void testCanLoadArrayAndListFromConfiguration() {
        Assert.assertNotNull(itemsListProperties.getObject());

    }

}
