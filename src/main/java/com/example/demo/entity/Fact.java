package com.example.demo.entity;

public class Fact {
    String fact;
    long length;

    public Fact() {
    }

    public Fact(String fact, long length) {
        this.fact = fact;
        this.length = length;
    }

    public String getFact() {
        return fact;
    }

    public void setFact(String fact) {
        this.fact = fact;
    }

    public long getLength() {
        return length;
    }

    public void setLength(long length) {
        this.length = length;
    }
}
