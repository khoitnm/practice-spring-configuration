package org.tnmk.practicespringconfiguration.pro01conditionalconfig.itemslist;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.tnmk.practicespringconfiguration.pro01conditionalconfig.Pro01ConditionalConfigApplication;
import org.tnmk.practicespringconfiguration.pro01conditionalconfig.config.itemslist.conditiononexpression.ConfiguredCorrectlyItemsListBB;
import org.tnmk.practicespringconfiguration.pro01conditionalconfig.config.itemslist.conditiononexpression.NotConfiguredItemsListBB;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Pro01ConditionalConfigApplication.class)
public class ConditionOnExpressionTest {

    @Autowired(required = false)
    private NotConfiguredItemsListBB notConfiguredItemsListBB;

    @Autowired(required = false)
    private ConfiguredCorrectlyItemsListBB configuredCorrectlyItemsListBB;
    @Test
    public void testConditionalOnExpression() {
        Assert.assertNull(notConfiguredItemsListBB);
        Assert.assertNotNull(configuredCorrectlyItemsListBB);
    }

}
