package com.github.rinaudosal.designpatterns.structural.bridge;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BridgeTest {

    @Test
    void printerFormatterShouldWork() {
        Movie movie = new Movie();
        movie.setTitle("John Wick");
        movie.setClassification("Action");
        movie.setRuntime("2:15");
        movie.setYear("2014");

        Formatter formatter = new PrinterFormatter();
        Printer moviePrinter = new MoviePrinter(movie);
        String moviePrinted = moviePrinter.print(formatter);

        assertThat(moviePrinted).isEqualTo("Action\nTitle: John Wick\nRuntime: 2:15\nYear: 2014\n");
    }

    @Test
    void htmlFormatterShouldWork() {
        Movie movie = new Movie();
        movie.setTitle("John Wick");
        movie.setClassification("Action");
        movie.setRuntime("2:13");
        movie.setYear("2014");

        Formatter formatter = new HtmlFormatter();
        Printer moviePrinter = new MoviePrinter(movie);
        String moviePrinted = moviePrinter.print(formatter);

        assertThat(moviePrinted).isEqualTo("<table><th>Classification</th><th>Action</th><tr><td>Title</td><td>John Wick</td></tr><tr><td>Runtime</td><td>2:13</td></tr><tr><td>Year</td><td>2014</td></tr></table>");
    }
}
