package com.cognizant.springlearn4.controller;

import com.cognizant.springlearn4.model.Country;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.*;

@RestController
public class CountryController {

    @RequestMapping(value = "/country", method = RequestMethod.GET)
    public Country getCountryIndia() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Country country = (Country) context.getBean("country");
        return country;
    }
}
