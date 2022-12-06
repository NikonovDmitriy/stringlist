package com.example.stringlist;

import com.example.stringlist.impl.StringListImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class StringListImplIsEmptyTest {

    private StringList out;

    @BeforeEach
    public void setUp() {
        out = new StringListImpl();
    }

    @Test
    public void shouldReturnTrue() {
        assertTrue(out.isEmpty());
    }

    @Test
    public void shouldReturnFalse() {
        out.add("1");
        assertFalse(out.isEmpty());
    }

}