package fr.janvd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void additionner() {
        int resutat = Main.additionner(1,2);
        assertEquals(3,resutat);
    }

    @Test
    void soustraire() {
        int resultat = Main.soustraire(3,4);
        assertEquals(-1,resultat);
    }
}