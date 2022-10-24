package com.example.intra.service;

import com.example.intra.controller.payload.response.AdditionResultDto;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ArithmeticService {
    public AdditionResultDto addTwoNumber(Integer firstNumber, Integer secondNumber) {
        Integer result = firstNumber + secondNumber;
        return new AdditionResultDto(result);
    }
}
