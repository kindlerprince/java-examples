package com.example.learnings.annotations.creation;

@SmartPhone(os = "Android", version = 6)
public class NokiaSeries {
  public String model;
  public int size;

  public NokiaSeries(String model, int size) {
    this.model = model;
    this.size = size;
  }
}
