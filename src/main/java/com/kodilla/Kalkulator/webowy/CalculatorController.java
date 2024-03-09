package com.kodilla.Kalkulator.webowy;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/calculator")
public class CalculatorController {

    @PostMapping(path = "add")
    public Long add(@RequestBody NumbersDto numbersDto) {
        return numbersDto.getNumber1() + numbersDto.getNumber2();
    }

    @PostMapping(path = "minus")
    public Long minus(@RequestBody NumbersDto numbersDto) {
        return numbersDto.getNumber1() - numbersDto.getNumber2();
    }

    @PostMapping(path = "times")
    public Long times(@RequestBody NumbersDto numbersDto) {
        return numbersDto.getNumber1() * numbersDto.getNumber2();
    }

    @PostMapping(path = "divide")
    public Long divide(@RequestBody NumbersDto numbersDto) {
        return numbersDto.getNumber1() / numbersDto.getNumber2();
    }
}
