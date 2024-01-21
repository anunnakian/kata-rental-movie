package com.arolla.refatoring.movierental;

public class HtmlRenderer implements Renderer {

  @Override
  public String header(String name) {
    return "<h1>Rental Record for " + name + "</h1>\n<table>";
  }

  @Override
  public String movie(Rental rental, double amount) {
    return "<tr><td>" + rental.getMovie().getTitle() + "</td><td>" + amount + "</td></tr>\n";
  }

  @Override
  public String footer(double totalAmount, int frequentRenterPoints) {
    return "</table><p>Amount owed is <em>" +
            totalAmount +
            "</em></p>\n" +
            "<p>You earned <em>" +
            frequentRenterPoints +
            "</em> frequent renter points</p>";
  }
}
