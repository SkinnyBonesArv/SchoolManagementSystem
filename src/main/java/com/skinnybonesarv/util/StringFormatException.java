package com.skinnybonesarv.util;

/**
 * @author Arvind
 */
public class StringFormatException extends IllegalArgumentException {

    private String str;

    public StringFormatException(String str) {
        super("Invalid string " + str);
        this.str = str;
    }

    public StringFormatException() {
        super();
    }

    public String getString() {
        return str;
    }

}
