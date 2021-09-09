package com.example.service;

import com.example.entity.Operation;
import org.springframework.stereotype.Service;

@Service
public class CalculationService {

    public Operation calculate(Operation operation){
        switch (operation.getOperationName()){
            case "sum": operation.setResult(operation.getNum1() + operation.getNum2());
                break;
            case "sub": operation.setResult(operation.getNum1() - operation.getNum2());
                break;
            case "div": operation.setResult(operation.getNum1() / operation.getNum2());
                break;
            case "mul": operation.setResult(operation.getNum1() * operation.getNum2());
                break;
        }
        return operation;
    }
}

