package com.arolla.refatoring.movierental;

public interface Renderer {
  String header(String name);

  String movie(Rental rental, double amount);

  String footer(double totalAmount, int frequentRenterPoints);
}
