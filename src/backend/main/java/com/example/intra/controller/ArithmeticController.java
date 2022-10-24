package com.example.intra.controller;

import com.example.intra.controller.payload.response.AdditionResultDto;
import com.example.intra.service.ArithmeticService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@CrossOrigin
public class ArithmeticController {
    ArithmeticService arithmeticService;

    @GetMapping("/additionne/{firstNumber}/{secondNumber}")
    public ResponseEntity<AdditionResultDto> additionne(@PathVariable(name = "firstNumber") Integer firstNumber,
                                                        @PathVariable(name = "secondNumber") Integer secondNumber){
        return ResponseEntity.ok().body(arithmeticService.addTwoNumber(firstNumber, secondNumber));
    }

}
