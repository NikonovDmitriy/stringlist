package com.example.stringlist;

import com.example.stringlist.impl.StringListImpl;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class StringListImplToArrayTest {

    @Test
    void shouldReturnStringsArray() {
        StringList out = new StringListImpl();
        out.add("1");
        out.add("2");
        out.add("3");

        String[] actual = new String[]{"1", "2", "3"};
        String[] expected = out.toArray();

        assertArrayEquals(expected, actual);
    }
}
