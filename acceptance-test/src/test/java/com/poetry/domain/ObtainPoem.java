package com.poetry.domain;

public interface ObtainPoem {
    default String getMeSomePoetry() {
        return "Twinkle Twinkle little star";
    }
}
