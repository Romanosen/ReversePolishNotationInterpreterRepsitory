package com.reversedpnotation.pack;

public enum Operation {

    PLUS('+'), SUBSTRUCT('-'), DIVIDE('/'), MULTIPLY('*'), POW('^');
    public char asChar() {
      return asChar;
    }

   private final char asChar;

    private Operation(char asChar) {
        this.asChar = asChar;
    }
}


