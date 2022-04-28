package com.studyproject.patterns.behavioral.visitor.interpreter;

import com.studyproject.patterns.behavioral.visitor.model.DotOperation;
import com.studyproject.patterns.behavioral.visitor.model.MinusOperation;
import com.studyproject.patterns.behavioral.visitor.model.Operation;
import com.studyproject.patterns.behavioral.visitor.model.PlusOperation;

import java.util.List;

public class InterpreterImpl implements Interpreter {


    @Override
    public void process(Operation... operations) {
        List.of(operations).forEach(operation -> operation.accept(this));
    }

    @Override
    public void process(PlusOperation operation) {
        System.out.println("+");
    }

    @Override
    public void process(MinusOperation operation) {
        System.out.println("-");
    }

    @Override
    public void process(DotOperation operation) {
        System.out.println(".");
    }
}
