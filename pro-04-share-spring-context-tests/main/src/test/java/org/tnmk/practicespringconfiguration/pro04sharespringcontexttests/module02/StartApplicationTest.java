package org.tnmk.practicespringconfiguration.pro04sharespringcontexttests.module02;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.invoke.MethodHandles;

public class StartApplicationTest extends BaseTest {
    private static final Logger logger = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

    @Test
    public void testStartApplication(){
        logger.info("Finished Test");
    }
}
