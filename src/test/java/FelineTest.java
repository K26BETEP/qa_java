package com.example;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class FelineTest {

    @Test
    public void eatMeatReturnsPredatorFood() throws Exception {
        List<String> expected = Arrays.asList("Животные", "Птицы", "Рыба");
        assertEquals(expected, new CatFamily().eatMeat());
    }

    @Test
    public void getFamilyReturnsFelineFamily() {
        assertEquals("Кошачьи", new CatFamily().getFamily());
    }

    @Test
    public void getKittensWithoutArgsReturnsOne() {
        assertEquals(1, new CatFamily().getKittens());
    }

    @Test
    public void getKittensWithZeroReturnsZero() {
        assertEquals(0, new CatFamily().getKittens(0));
    }

    @Test
    public void getKittensWithFiveReturnsFive() {
        assertEquals(5, new CatFamily().getKittens(5));
    }
}
