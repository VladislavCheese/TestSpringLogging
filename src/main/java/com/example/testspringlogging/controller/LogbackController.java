package com.example.testspringlogging.controller;

import ch.qos.logback.classic.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LogbackController {
    private static final Logger logger
            = (Logger) LoggerFactory.getLogger(LogbackController.class);

    @RequestMapping("/logback")
    public String index()  {
        logger.info("Example log from {}", LogbackController.class.getSimpleName());
        logger.warn("Warn massage {}", LogbackController.class.getSimpleName());
        logger.debug("Debug massage {}", LogbackController.class.getSimpleName());

        return "Check logback output";
    }
}
