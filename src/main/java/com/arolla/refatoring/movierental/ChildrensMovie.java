package com.arolla.refatoring.movierental;

public class ChildrensMovie extends Movie {

  public ChildrensMovie(String title) {
    super(title);
  }

  public double getAmount(int daysRented) {
    if (daysRented > 3) {
      return 1.5 + (daysRented - 3) * 1.5;
    }

    return 1.5;
  }
}
