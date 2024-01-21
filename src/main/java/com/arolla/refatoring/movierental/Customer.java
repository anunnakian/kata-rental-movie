package com.arolla.refatoring.movierental;

import java.util.ArrayList;
import java.util.List;

public class Customer {

  private final String name;
  private final List<Rental> rentals;

  public Customer(String name) {
    this.name = name;
    this.rentals = new ArrayList<>();
  }

  public void rent(Rental rental) {
    rentals.add(rental);
  }

  public String statement(Renderer renderer) {
    StringBuilder result = new StringBuilder(renderer.header(name));

    double totalAmount = 0;
    for (Rental rental : rentals) {
      double amount = rental.amount();

      result.append(renderer.movie(rental, amount));
      totalAmount += amount;
    }

    result.append(renderer.footer(totalAmount, calculateRenterPoints()));

    return result.toString();
  }

  private int calculateRenterPoints() {
    return rentals.stream().mapToInt(Rental::getRenterPoints).sum();
  }
}
