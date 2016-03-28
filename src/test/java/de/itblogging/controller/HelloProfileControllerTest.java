package de.itblogging.controller;

import de.itblogging.SpringProfilesApplication;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.IntegrationTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ActiveProfiles("production")
@IntegrationTest
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {SpringProfilesApplication.class})
@TestPropertySource(locations={"classpath:application.properties", "classpath:application-production.properties"})
public class HelloProfileControllerTest {

    @Autowired
    private HelloProfileController helloProfileController;

    @Test
    public void testProductionProfile() {
        Assert.assertEquals("production", helloProfileController.getEnvironment());
    }

    @Test
    public void testProductionProfileValue() {
        Assert.assertEquals("I am running on port 8081", helloProfileController.getPortInformation());
    }

}