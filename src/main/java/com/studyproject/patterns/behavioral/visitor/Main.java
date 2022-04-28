package com.studyproject.patterns.behavioral.visitor;

import com.studyproject.patterns.behavioral.visitor.interpreter.Interpreter;
import com.studyproject.patterns.behavioral.visitor.interpreter.InterpreterImpl;
import com.studyproject.patterns.behavioral.visitor.model.DotOperation;
import com.studyproject.patterns.behavioral.visitor.model.MinusOperation;
import com.studyproject.patterns.behavioral.visitor.model.PlusOperation;

public class Main {

    public static void main(String[] args) {

        Interpreter interpreter = new InterpreterImpl();
        interpreter.process(
                new PlusOperation(),
                new MinusOperation(),
                new DotOperation()
        );

    }
}
