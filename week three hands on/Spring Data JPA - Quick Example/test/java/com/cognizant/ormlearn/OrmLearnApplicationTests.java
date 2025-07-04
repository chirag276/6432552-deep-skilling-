package com.cognizant.ormlearn;

import com.cognizant.ormlearn.service.CountryService;
import com.cognizant.ormlearn.model.Country;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class OrmLearnApplicationTests {

    @Autowired
    private CountryService countryService;

    @Test
    void contextLoads() {
        // This checks if the Spring application context loads successfully
        assertNotNull(countryService);
    }

    @Test
    void testGetAllCountries() {
        List<Country> countries = countryService.getAllCountries();
        assertNotNull(countries);
        assertFalse(countries.isEmpty(), "The country list should not be empty");
    }
}
