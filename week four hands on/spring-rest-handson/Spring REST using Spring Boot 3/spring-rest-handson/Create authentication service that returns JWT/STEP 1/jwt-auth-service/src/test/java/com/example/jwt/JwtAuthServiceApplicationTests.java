package com.example.jwt;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.security.test.web.servlet.request.SecurityMockMvcRequestPostProcessors.httpBasic;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

@SpringBootTest
@AutoConfigureMockMvc
public class JwtAuthServiceApplicationTests {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testAuthenticateEndpointWithValidCredentials() throws Exception {
        mockMvc.perform(get("/authenticate")
                .with(httpBasic("user", "pwd")))
                .andExpect(status().isOk())
                .andExpect(content().string("This is the authentication endpoint. Next step: parse Basic Auth and generate JWT."));
    }

    @Test
    public void testAuthenticateEndpointWithInvalidCredentials() throws Exception {
        mockMvc.perform(get("/authenticate")
                .with(httpBasic("wrong", "user")))
                .andExpect(status().isUnauthorized());
    }
}

