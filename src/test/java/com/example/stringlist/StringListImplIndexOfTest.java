package com.example.stringlist;

import com.example.stringlist.impl.StringListImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StringListImplIndexOfTest {

    private StringList out;

    @BeforeEach
    void setUp() {
        out = new StringListImpl();

        out.add("1");
        out.add("2");
        out.add("3");
    }

    @Test // indexOf(item)
    public void shouldReturnIndexOfItem() {
        int actual = 1;
        int expected = out.indexOf("2");
        assertEquals(expected, actual);
    }

    @Test // indexOf(item) when this item not consists
    public void shouldReturnBadIndex() {
        int actual = -1;
        int expected = out.indexOf("10");
        assertEquals(expected, actual);
    }
}
