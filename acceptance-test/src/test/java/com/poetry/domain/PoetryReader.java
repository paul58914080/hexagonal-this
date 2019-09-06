package com.poetry.domain;

public class PoetryReader implements RequestVerse {
    private ObtainPoem obtainPoem;

    public PoetryReader(ObtainPoem obtainPoem) {
        this.obtainPoem = obtainPoem;
    }

    public PoetryReader() {
        this(new ObtainPoem() {
        });
    }

    @Override
    public String getPoetry() {
        return obtainPoem.getMeSomePoetry();
    }
}
