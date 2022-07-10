package com.example.learnings.annotations.override;

public class Car extends Vehicle {
  // Read about the Override by double-clicking into them
  // Mis spell the function name, compilation error will be thrown
  @Override
  public void showTheManufacturingDate() {
    System.out.println("This is inside the Car");
  }
}
