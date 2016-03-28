package de.itblogging.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloProfileController {

    @Autowired
    @Qualifier(value = "environment")
    private String environment;

    @Value("${server.port.information}")
    private String portInformation;

    @RequestMapping(path = "/environment", method = RequestMethod.GET)
    public String getEnvironment() {
        return environment;
    }

    @RequestMapping(path = "/portInformation", method = RequestMethod.GET)
    public String getPortInformation() {
        return portInformation;
    }
}
