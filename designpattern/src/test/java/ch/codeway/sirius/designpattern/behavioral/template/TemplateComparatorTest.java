package ch.codeway.sirius.designpattern.behavioral.template;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TemplateComparatorTest {

    private List<Person> people;
    private Person bryan;
    private Person mark;
    private Person chris;

    @Before
    public void setUp() {
        bryan = new Person("Bryan", "801-555-1212", 39);
        mark = new Person("Mark", "801-444-1234", 41);
        chris = new Person("Chris", "801-222-5151", 38);

        people = new ArrayList<>();
        people.add(bryan);
        people.add(mark);
        people.add(chris);
    }

    @Test
    public void peopleNotSorted() {
        Assertions.assertThat(people).containsExactly(bryan, mark, chris);
    }

    @Test
    public void peolpleSortedWithItsSort() {
        Collections.sort(people);
        Assertions.assertThat(people).containsExactly(chris, bryan, mark);
    }
}
