package com.github.rinaudosal.designpatterns.creational.prototype;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class PrototypeTest {

    @Test
    void checkMovieProducedCorrectlyWithDifferentInstance() throws Exception {
        ItemRegistry registry = new ItemRegistry();

        MovieItem starWars = registry.getItem(ItemEnum.MOVIE);
        starWars.title("Star wars. Episode 1");

        MovieItem starWars9 = registry.getItem(ItemEnum.MOVIE);
        starWars9.title("Star wars. Episode 9");

        assertThat(starWars.title()).isEqualTo("Star wars. Episode 1");
        assertThat(starWars.price()).isEqualTo(23.00);
        assertThat(starWars.hours()).isEqualTo(4);
        assertThat(starWars.url()).isEqualTo("www.amazon.it/movies");

        assertThat(starWars9.title()).isEqualTo("Star wars. Episode 9");
        assertThat(starWars9.price()).isEqualTo(23.00);
        assertThat(starWars9.hours()).isEqualTo(4);
        assertThat(starWars9.url()).isEqualTo("www.amazon.it/movies");
    }

    @Test
    void checkBookProducedCorrectlyWithDifferentInstance() throws Exception {
        ItemRegistry registry = new ItemRegistry();

        BookItem bible = registry.getItem(ItemEnum.BOOK);
        bible.pages(4000).title("The holy bible");

        BookItem koran = registry.getItem(ItemEnum.BOOK);
        koran.pages(3000).title("Koran");

        assertThat(bible.title()).isEqualTo("The holy bible");
        assertThat(bible.pages()).isEqualTo(4000);
        assertThat(bible.price()).isEqualTo(23.00);
        assertThat(bible.url()).isEqualTo("www.amazon.it/books");

        assertThat(koran.title()).isEqualTo("Koran");
        assertThat(koran.pages()).isEqualTo(3000);
        assertThat(koran.price()).isEqualTo(23.00);
        assertThat(koran.url()).isEqualTo("www.amazon.it/books");
    }

    @Test
    void throwClassCastExceptionWhenIPutWrongReturnClass() {
        assertThatThrownBy(() -> {
            ItemRegistry registry = new ItemRegistry();
            BookItem koran = registry.getItem(ItemEnum.MOVIE);
        }).isInstanceOf(ClassCastException.class);
    }
}
