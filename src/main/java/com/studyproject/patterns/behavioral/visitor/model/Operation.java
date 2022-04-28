package com.studyproject.patterns.behavioral.visitor.model;

import com.studyproject.patterns.behavioral.visitor.interpreter.Interpreter;

public interface Operation {

    void accept(Interpreter interpreter);
}
