package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class DiceScoreTest {

    private Ide de;

    @BeforeEach
    void setUp() {
       de = mock(Ide.class);
    }

    @Test
    @DisplayName("Retourne la valeur du dé * 2 + 10 quand les 2 dés sont identiques")
    void shouldReturnDoubleValuePusThenWhenBothDiceAreEquals()
    {
        when(de.getRoll()).thenReturn(4,4);

        DiceScore diceScore = new DiceScore(de);

        assertEquals(18, diceScore.getScore());
    }

    @Test
    @DisplayName("Retourne 30 quand les 2 dés valent 6")
    void shouldReturnThrityWhenBothDiceAreSix()
    {
        when(de.getRoll()).thenReturn(6,6);

        DiceScore diceScore = new DiceScore(de);

        assertEquals(30, diceScore.getScore());
    }

    @Test
    @DisplayName("Retourne la valeur la plus haute quand les 2 dés sont différents")
    void shouldReturnHighestValueWhenDiceAreDifferent()
    {
        when(de.getRoll()).thenReturn(6,7);

        DiceScore diceScore = new DiceScore(de);

        assertEquals(7, diceScore.getScore());
    }




}
