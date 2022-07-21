package com.julian.sabos;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    @Test
    public void shouldAnswerWithTrue()
    {
        // GIVEN
        final App app = new App();

        // WHEN
        app.initBand();

        // THEN
        assertThat(App.BANDS).isNotNull().hasSize(2);

    }
}
