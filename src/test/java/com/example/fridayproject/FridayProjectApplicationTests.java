package com.example.fridayproject;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@AutoConfigureMockMvc
@SpringBootTest
class FridayProjectApplicationTests {
@Autowired
    MockMvc mockMvc;
    @Test
    void setDecimal() throws Exception{
        mockMvc.perform(MockMvcRequestBuilders.post("/api/decimal/setDecimal/?decimal=3").header("decimalPlaces","2")
                        .contentType(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().isOk());
    }

    @Test
    void getDecimal() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/api/decimal/getDecimal"))
                .andDo(print())
                .andExpect(status().isOk());

    }

    @Test
    void getMultiplier() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/api/multiplier/getMultiplier"))
                .andDo(print())
                .andExpect(status().isOk());
    }

        @Test
        void setMultiplier() throws Exception{
            mockMvc.perform(MockMvcRequestBuilders.post("/api/multiplier/setMultiplier?multiplier=2")
                            .contentType(MediaType.APPLICATION_JSON))
                    .andDo(print())
                    .andExpect(status().isOk());
        }

        @Test
    void getNumbers() throws Exception{
        mockMvc.perform(MockMvcRequestBuilders.get("/api/number/getCalculatedValues")
                        .contentType(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().isOk());
        }





}
