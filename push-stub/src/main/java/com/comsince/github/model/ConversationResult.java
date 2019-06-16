package com.comsince.github.model;

import java.io.Serializable;

public class ConversationResult implements Serializable {
    private int type;
    private String target;
    private int line;

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public int getLine() {
        return line;
    }

    public void setLine(int line) {
        this.line = line;
    }
}
