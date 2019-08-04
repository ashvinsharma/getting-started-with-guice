package com.example.guice;

public class TextWriter implements ITextWriter {
    @Override
    public void write(String str) { System.out.println(str); }
}
