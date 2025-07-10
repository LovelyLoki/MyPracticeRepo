package com.cognizant.springlearn5.service;

import com.cognizant.springlearn5.model.Country;
import com.cognizant.springlearn5.model.CountryList;

import org.springframework.stereotype.Service;

import jakarta.annotation.PostConstruct;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import java.io.InputStream;
import java.util.List;
import java.util.Optional;

@Service
public class CountryService {

    private List<Country> countryList;

    @PostConstruct
    public void init() throws Exception {
        JAXBContext context = JAXBContext.newInstance(CountryList.class);
        Unmarshaller unmarshaller = context.createUnmarshaller();
        InputStream inputStream = getClass().getResourceAsStream("/country.xml");
        CountryList countries = (CountryList) unmarshaller.unmarshal(inputStream);
        countryList = countries.getCountries();
    }

    public Country getCountry(String code) throws Exception {
        Optional<Country> match = countryList.stream()
                .filter(c -> c.getCode().equalsIgnoreCase(code))
                .findFirst();

        if (match.isPresent()) {
            return match.get();
        } else {
            throw new Exception("Country not found with code: " + code);
        }
    }
}

