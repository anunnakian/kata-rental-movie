package com.arolla.refatoring.movierental;

/**
 * The rental class represents a customer renting a movie.
 */
public class Rental {

  private final Movie movie;
  private final int daysRented;

  public Rental(Movie movie, int daysRented) {
    this.movie = movie;
    this.daysRented = daysRented;
  }

  public Movie getMovie() {
    return movie;
  }

  public int getRenterPoints() {
    if (movie.isNewRelease() && daysRented > 1) {
      return 2;
    }

    return 1;
  }

  public double amount() {
    return movie.getAmount(daysRented);
  }
}
