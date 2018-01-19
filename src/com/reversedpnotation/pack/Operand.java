package com.reversedpnotation.pack;
import java.util.Map;

public interface Operand {
    double evaluate(Map<String, Integer> context);
    void traverse(int level);
}
