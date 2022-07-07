package org.tnmk.practicespringconfiguration.pro00simpleconfig.config;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.tnmk.practicespringconfiguration.pro00simpleconfig.Pro00SimpleConfigApplication;

@ActiveProfiles({ "test" })
@SpringBootTest(classes = Pro00SimpleConfigApplication.class)
public class BaseIntegrationTest {

}
