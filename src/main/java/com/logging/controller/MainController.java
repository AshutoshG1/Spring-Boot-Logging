package com.logging.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
//@Slf4j ==>this annotation eliminates the need to manually create a logger instance
@RestController
@RequestMapping("/api/main")
public class MainController {

    private Logger logger = LoggerFactory.getLogger(MainController.class);


    @GetMapping
    public String mainMethod(
            @RequestParam(defaultValue = "default value", required = false) String value
    ){
        logger.info("This is api calling : info{}",value);
        logger.debug("This is api calling : debug");
        logger.error("This is api calling : error");
        logger.warn("This is api calling : warn");
        logger.trace("This is api calling : trace");
        return "this is main method";
    }
}
