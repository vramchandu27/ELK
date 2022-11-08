package com.elk.ELK;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

@RestController
public class Controller {

    private static final Logger LOG = Logger.getLogger(Controller.class.getName());

    @RequestMapping("hello")
    public String helloWorld() {
        String response = "Welcome to javainuse" + new Date();
        LOG.log(Level.INFO, response);

        return response;
    }
}
