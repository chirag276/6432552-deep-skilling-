@Test
public void testGetCountryByCode() throws Exception {
    mockMvc.perform(get("/countries/in"))
           .andExpect(status().isOk())
           .andExpect(jsonPath("$.code").value("IN"))
           .andExpect(jsonPath("$.name").value("India"));

    mockMvc.perform(get("/countries/US"))
           .andExpect(status().isOk())
           .andExpect(jsonPath("$.code").value("US"))
           .andExpect(jsonPath("$.name").value("United States"));
}
