package com.arolla.refatoring.movierental;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CustomerTest {

    @Test
    public void shouldRenderConsole() {
        String expected =
                "Rental Record for Bob\n" +
                "\tJaws\t2.0\n" +
                "\tGolden Eye\t3.5\n" +
                "\tShort New\t3.0\n" +
                "\tLong New\t6.0\n" +
                "\tBambi\t1.5\n" +
                "\tToy Story\t3.0\n" +
                "Amount owed is 19.0\n" +
                "You earned 7 frequent renter points";

        assertEquals(expected, customer().statement(new ConsoleRenderer()));
    }

    @Test
    void shouldRenderHtml() {
        String expected =
                "<h1>Rental Record for Bob</h1>\n" +
                "<table>" +
                "<tr><td>Jaws</td><td>2.0</td></tr>\n" +
                "<tr><td>Golden Eye</td><td>3.5</td></tr>\n" +
                "<tr><td>Short New</td><td>3.0</td></tr>\n" +
                "<tr><td>Long New</td><td>6.0</td></tr>\n" +
                "<tr><td>Bambi</td><td>1.5</td></tr>\n" +
                "<tr><td>Toy Story</td><td>3.0</td></tr>\n" +
                "</table>" +
                "<p>Amount owed is <em>19.0</em></p>\n" +
                "<p>You earned <em>7</em> frequent renter points</p>";

        assertEquals(expected, customer().statement(new HtmlRenderer()));
    }

    private Customer customer() {
        Customer customer = new Customer("Bob");
        customer.rent(new Rental(Movies.regular("Jaws"), 2));
        customer.rent(new Rental(Movies.regular("Golden Eye"), 3));
        customer.rent(new Rental(Movies.newRelease("Short New"), 1));
        customer.rent(new Rental(Movies.newRelease("Long New"), 2));
        customer.rent(new Rental(Movies.children("Bambi"), 3));
        customer.rent(new Rental(Movies.children("Toy Story"), 4));
        return customer;
    }
}
