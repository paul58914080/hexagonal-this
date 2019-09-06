package com.poetry.domain.ports;

public interface ObtainPoem {
    default String getMeSomePoetry() {
        return "Twinkle Twinkle little star";
    }
}
