package com.studyproject.patterns.behavioral.visitor.model;

import com.studyproject.patterns.behavioral.visitor.interpreter.Interpreter;

public class DotOperation implements Operation {

    @Override
    public void accept(Interpreter interpreter) {
        interpreter.process(this);
    }
}
