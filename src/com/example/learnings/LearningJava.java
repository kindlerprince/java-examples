package com.example.learnings;

import com.example.learnings.annotations.creation.NokiaSeries;
import com.example.learnings.annotations.creation.SmartPhone;
import com.example.learnings.annotations.override.Car;
import com.example.learnings.annotations.override.Vehicle;
import java.lang.annotation.Annotation;

public class LearningJava {
  public static void main(String[] args) {
    // Overriding Annotations Usage
    System.out.println("Learning Annotations using Demo");
    Vehicle vehicle = new Vehicle();
    vehicle.showTheManufacturingDate();
    Car car = new Car();
    car.showTheManufacturingDate();

    // Custom Annotations Usage
    NokiaSeries nokiaSeries = new NokiaSeries("Fire", 5);
    System.out.println(nokiaSeries.model);
    System.out.println(nokiaSeries.size);

    // Class c = NokiaSeries.class /* You will get warning of raw usage */
    Class<NokiaSeries> c = NokiaSeries.class;
    // Reflection API to get the properties of class
    // Class c = nokiaSeries.getClass();
    Annotation annotation = c.getAnnotation(SmartPhone.class);
    SmartPhone smartPhone = (SmartPhone) annotation;

    /* The above two lines can be optimized as
     * SmartPhone smartPhone = c.getAnnotation(SmartPhone.class);
     */

    System.out.println(smartPhone.os());
    System.out.println(smartPhone.version());
  }
}
