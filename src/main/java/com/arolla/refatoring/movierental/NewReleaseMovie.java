package com.arolla.refatoring.movierental;

public class NewReleaseMovie extends Movie {

  public NewReleaseMovie(String title) {
    super(title);
  }

  public double getAmount(int daysRented) {
    return daysRented * 3;
  }

  @Override
  public boolean isNewRelease() {
    return true;
  }
}
