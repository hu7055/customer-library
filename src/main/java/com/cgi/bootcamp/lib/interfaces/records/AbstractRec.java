package com.cgi.bootcamp.lib.interfaces.records;

public abstract class AbstractRec implements Record{

    private String line;

    public void setLine(String line) {
        this.line = line;
    }

    public String getLine(){
        return line;
    }
}
