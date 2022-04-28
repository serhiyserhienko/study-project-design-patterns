package com.studyproject.patterns.behavioral.visitor.interpreter;

import com.studyproject.patterns.behavioral.visitor.model.DotOperation;
import com.studyproject.patterns.behavioral.visitor.model.MinusOperation;
import com.studyproject.patterns.behavioral.visitor.model.Operation;
import com.studyproject.patterns.behavioral.visitor.model.PlusOperation;

/**
 * Visitor interface
 */
public interface Interpreter {

    void process(Operation... operations);

    void process(PlusOperation operation);

    void process(MinusOperation operation);

    void process(DotOperation operation);
}
