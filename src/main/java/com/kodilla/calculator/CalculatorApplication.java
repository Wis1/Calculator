package com.kodilla.calculator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CalculatorApplication {

    public int addNumbers(int number1, int number2){
        int sum= number1+number2;
        return sum;
    }

    public int subtractNumber(int number1, int number2){
        int difference= number1-number2;
        return difference;
    }

    public static void main(String[] args)
        {SpringApplication.run(CalculatorApplication.class, args);
        int sum, difference;
        CalculatorApplication calculator= new CalculatorApplication();
        sum=calculator.addNumbers(56,78);
        System.out.println(sum);
        difference=calculator.subtractNumber(123,24);
        System.out.println(difference);
    }

}
