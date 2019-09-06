package com.poetry.domain;

import com.poetry.domain.ports.ObtainPoem;
import com.poetry.domain.ports.RequestVerse;

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
