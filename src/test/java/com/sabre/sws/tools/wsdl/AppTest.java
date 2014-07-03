package com.sabre.sws.tools.wsdl;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AppTest {

    @BeforeMethod
    public void setUp() throws Exception {
    }

    @AfterMethod
    public void tearDown() throws Exception {
    }

    @Test
    public void testApp() {
        assertThat(true).isTrue();
    }
}
