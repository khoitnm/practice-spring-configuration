package org.tnmk.practicespringconfiguration.pro04sharespringcontexttests.main;

import java.lang.invoke.MethodHandles;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Test02_ShareContext extends BaseTest {
    private static final Logger logger = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

    @Test
    public void testStartApplication(){
        logger.info("Finished Test 02");
    }
}
