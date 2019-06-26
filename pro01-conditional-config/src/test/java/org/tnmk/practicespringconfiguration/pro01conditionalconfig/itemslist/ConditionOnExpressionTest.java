package org.tnmk.practicespringconfiguration.pro01conditionalconfig.itemslist;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.tnmk.practicespringconfiguration.pro01conditionalconfig.Pro01ConditionalConfigApplication;
import org.tnmk.practicespringconfiguration.pro01conditionalconfig.config.itemslist.conditiononexpression.ConfiguredCorrectlyItemsListBC;
import org.tnmk.practicespringconfiguration.pro01conditionalconfig.config.itemslist.conditiononexpression.NotConfiguredItemsListC;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Pro01ConditionalConfigApplication.class)
public class ConditionOnExpressionTest {

    @Autowired(required = false)
    private NotConfiguredItemsListC notConfiguredItemsListC;

    @Autowired(required = false)
    private ConfiguredCorrectlyItemsListBC configuredCorrectlyItemsListBC;
    @Test
    public void testConditionalOnExpression() {
        Assert.assertNull(notConfiguredItemsListC);
        Assert.assertNotNull(configuredCorrectlyItemsListBC);
    }

}
