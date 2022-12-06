package com.example.stringlist;

import com.example.stringlist.exceptions.IndexIsNotValidException;
import com.example.stringlist.exceptions.ItemIsNullException;
import com.example.stringlist.impl.StringListImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class StringListImplSetTest {

    private StringList out;

    @BeforeEach
    void setUp() {
        out = new StringListImpl();

        out.add("1");
        out.add("2");
        out.add("3");
    }

    @Test // set(index, item)
    public void shouldReturnNewAddedItem() {
        String actual = "actual";
        String expected = out.set(1, actual);
        assertEquals(expected, actual);
    }

    @Test // set(index, item) when index is bad
    public void shouldThrowIndexIsNotValidExceptionWhenCallSetWithInvalidIndex() {
        assertThrows(IndexIsNotValidException.class,
                () -> out.set(4, "example"));
    }

    @Test // set(index, item) when item is null
    public void shouldThrowItemIsNullExceptionWhenCallSetWithNullItem() {
        assertThrows(ItemIsNullException.class,
                () -> out.set(1, null));
    }

}
