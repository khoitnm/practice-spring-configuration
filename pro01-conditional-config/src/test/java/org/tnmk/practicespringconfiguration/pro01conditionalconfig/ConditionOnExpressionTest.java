package org.tnmk.practicespringconfiguration.pro01conditionalconfig;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.tnmk.practicespringconfiguration.pro01conditionalconfig.service.conditiononexpression.*;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Pro01ConditionalConfigApplication.class)
public class ConditionOnExpressionTest {

    @Autowired(required = false)
    private ServiceArrayA serviceArrayA;

    @Autowired(required = false)
    private ServiceListB serviceListB;

    @Autowired(required = false)
    private NotConfiguredServiceC notConfiguredServiceC;

    @Autowired(required = false)
    private ConfiguredByAccidentServiceC configuredByAccidentServiceC;

    @Autowired(required = false)
    private ConfiguredServiceBC configuredServiceBC;

    @Test
    public void testConditionalOnExpression() {
        Assert.assertNotNull(serviceArrayA);

        Assert.assertNotNull(serviceListB);

        Assert.assertNull(notConfiguredServiceC);

        Assert.assertNotNull(configuredByAccidentServiceC);

        Assert.assertNotNull(configuredServiceBC);
    }

}
