package com.github.rinaudosal.designpatterns.structural.bridge;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BridgeTest {

    @Test
    void movieFormatterShouldWork() {
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
}
