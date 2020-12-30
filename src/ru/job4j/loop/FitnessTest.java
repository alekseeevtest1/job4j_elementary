package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class FitnessTest {
    @Test
    public void whenIvanGreatNik() {
        int month = Fitnes.calc(95, 90);
        assertThat(month, is(0));
    }

    @Test
    public void whenIvanLessByOneNik() {
        int month = Fitnes.calc(90, 95);
        assertThat(month, is(1));
    }

    @Test
    public void whenIvanLessByFewNik() {
        int month = Fitnes.calc(50, 90);
        assertThat(month, is(2));
    }

    @Test
    public void whenIvanLessByOneeNik() {
        int month = Fitnes.calc(90, 90);
        assertThat(month, is(1));
    }
}