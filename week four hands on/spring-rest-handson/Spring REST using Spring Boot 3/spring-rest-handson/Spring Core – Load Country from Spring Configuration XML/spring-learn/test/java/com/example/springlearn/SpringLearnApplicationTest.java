package com.example.springlearn;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringLearnApplicationTest {

    @Test
    public void testDateParsing() throws Exception {
        ApplicationContext context = new ClassPathXmlApplicationContext("date-format.xml");
        SimpleDateFormat format = context.getBean("dateFormat", SimpleDateFormat.class);
        Date parsedDate = format.parse("31/12/2018");
        String formatted = format.format(parsedDate);
        assertEquals("31/12/2018", formatted, "Date should be parsed and formatted correctly");
    }
}

