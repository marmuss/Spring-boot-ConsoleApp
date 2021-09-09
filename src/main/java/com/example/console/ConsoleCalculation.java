package com.example.console;

import com.example.entity.Operation;
import com.example.service.CalculationService;
import org.springframework.stereotype.Component;

@Component
public class ConsoleCalculation {
    private Operation operation;
    private CalculationService calculation;
    private ConsoleReader reader;
    private ConsoleWriter writer;

    public ConsoleCalculation(Operation operation, CalculationService calculation, ConsoleReader reader, ConsoleWriter writer) {
        this.operation = operation;
        this.calculation = calculation;
        this.reader = reader;
        this.writer = writer;
    }

    private Operation getParameters(){
        operation.setNum1(reader.readDouble());
        operation.setNum2(reader.readDouble());
        operation.setOperationName(reader.readStr());
        return operation;
    }

    public void getResult(){
        writer.write(String.valueOf(calculation.calculate(getParameters()).getResult()));
    }
}