package org.tnmk.practicespringconfiguration.pro01oncondition.welcome;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.tnmk.practicespringconfiguration.pro01oncondition.config.DataConfig;

import java.util.Arrays;

@RestController
public class WelcomeController {

    @Value("${welcome-message}")
    private String welcomeMessage;

    @Autowired
    private DataConfig dataConfig;

    @RequestMapping({"/", "/welcome"})
    public String welcome() {
        String myListData = String.format("Array with %s elements: %s", dataConfig.getMyArrayData().length, Arrays.toString(dataConfig.getMyArrayData()));
        return welcomeMessage + "" + myListData;
    }
}
