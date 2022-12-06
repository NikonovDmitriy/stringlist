package com.example.stringlist;

import com.example.stringlist.impl.StringListImpl;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class StringListImplClearTest {

    @Test
    public void isEmptyShouldReturnTrueAfterClear() {
        StringList out = new StringListImpl();
        out.add("1");
        out.clear();
        assertTrue(out.isEmpty());
    }
}
