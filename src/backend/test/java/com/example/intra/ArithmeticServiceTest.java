package com.example.intra;

import com.example.intra.controller.payload.response.AdditionResultDto;
import com.example.intra.service.ArithmeticService;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

@SpringBootTest
public class ArithmeticServiceTest {

    @InjectMocks
    private ArithmeticService arithmeticService;

    @Test
    void additionHappyDay(){
        AdditionResultDto number = arithmeticService.addTwoNumber(2, 2);

        assertThat(number.result()).isEqualTo(4);
    }
}
