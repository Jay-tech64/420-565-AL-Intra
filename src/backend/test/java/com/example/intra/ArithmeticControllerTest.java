package com.example.intra;

import com.example.intra.controller.ArithmeticController;
import com.example.intra.controller.payload.response.AdditionResultDto;
import com.example.intra.service.ArithmeticService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.*;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@ExtendWith(SpringExtension.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
public class ArithmeticControllerTest {
    @MockBean
    private ArithmeticService arithmeticService;

    @Autowired
    MockMvc mockMvc;

    @InjectMocks
    ArithmeticController controller;

    @Test
    void additionHappyDay() throws Exception{
        AdditionResultDto mockDto = new AdditionResultDto(4);

        when(arithmeticService.addTwoNumber(anyInt(), anyInt())).thenReturn(mockDto);

        MvcResult mvcResult = mockMvc.perform(post("/sign-in")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(asJsonString(signInDto)))
                .andDo(print())
                .andExpect(status().isOk())
                .andReturn();

        String content = mvcResult.getResponse().getContentAsString();

        assertThat(content)
                .isNotNull()
                .isNotBlank()
                .isEqualTo(asJsonString(expectedJwtResponseDto));
    }
}
