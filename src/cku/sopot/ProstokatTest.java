package cku.sopot;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ProstokatTest {

    @Test
    void ujemnaWartoscBokuAJestNiedozwolona() {
        Prostokat prostokat = new Prostokat(5,3);
        prostokat.setBokA(-5);
        //Assertions.assertTrue(prostokat.getBokA()==5);
        Assertions.assertEquals(5, prostokat.getBokA());
    }

    @Test
    void ujemnaWartoscBokuBJestNiedozwolona() {
        Prostokat prostokat = new Prostokat(5,4);
        prostokat.setBokB(-4);
        //Assertions.assertTrue(prostokat.getBokA()==5);
        Assertions.assertEquals(4, prostokat.getBokB());
    }

    @Test
    void ujemneWartosciWkontruktorzeSaniedozwolone() {
        Prostokat prostokat = new Prostokat(-8, -3);
        Assertions.assertEquals(8, prostokat.getBokA());
        Assertions.assertEquals(3, prostokat.getBokB());
    }

    @Test
    void poprawneOblicznieObwodu() {
        Prostokat prostokat = new Prostokat (-3, 5);
        Assertions.assertEquals(16, prostokat.obliczObwod());
    }

    @Test
    void poproawneObliczniePola() {
        Prostokat prostokat = new Prostokat(4,-5);
        Assertions.assertEquals(20, prostokat.obliczPole());
    }
}