package org.tnmk.practicespringconfiguration.pro04sharespringcontexttests.main;

import java.lang.invoke.MethodHandles;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;

@ActiveProfiles("componenttest")
@ContextConfiguration()
@SpringBootTest(classes = Pro04ShareSpringContextTestsApplication.class)
public class Test03_DifferentContext extends BaseTest {
    private static final Logger logger = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

    @Test
    public void testStartApplication(){
        logger.info("Finished Test 03");
    }
}
