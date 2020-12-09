package com.poetry;

import com.poetry.port.RequestVerse;

public class PoetryReader implements RequestVerse {

  @Override
  public String giveMeSomePoem() {
    return "Twinkle Twinkle little star";
  }
}
