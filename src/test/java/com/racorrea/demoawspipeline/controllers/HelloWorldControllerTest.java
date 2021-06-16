package com.racorrea.demoawspipeline.controllers;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class HelloWorldControllerTest{

    HelloWorldController hw = new HelloWorldController();

    @Test
    void whenCallHello_shouldReturnStringHello(){
        String result = hw.hello();

        assertEquals("Hello World", result);
    }

}