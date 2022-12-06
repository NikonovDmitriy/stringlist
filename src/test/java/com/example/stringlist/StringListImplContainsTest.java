package com.example.stringlist;

import com.example.stringlist.impl.StringListImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class StringListImplContainsTest {

    private StringList out;

    @BeforeEach
    public void setUp() {
        out = new StringListImpl();
        out.add("1");
    }


    @Test
    public void shouldReturnTrueWhenItemContains() {
        assertTrue(out.contains("1"));
    }

    @Test
    public void shouldReturnFalseThenItemNotContains() {
        assertFalse(out.contains("10"));
    }
}
