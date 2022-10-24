package com.example.intra.controller;

import com.example.intra.controller.payload.response.AdditionResultDto;
import com.example.intra.service.ArithmeticService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@CrossOrigin
public class ArithmeticController {
    ArithmeticService arithmeticService;

    @GetMapping("/additionne?fn={firstNumber}&sn={secondNumber}")
    public ResponseEntity<AdditionResultDto> additionne(@PathVariable(name = "firstNumber") Integer firstNumber,
                                                        @PathVariable(name = "secondNumber") Integer secondNumber){
        return arithmeticService.addTwoNumber(firstNumber, secondNumber);
    }

}
