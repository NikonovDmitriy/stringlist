package com.example.stringlist;

import com.example.stringlist.exceptions.IndexIsNotValidException;
import com.example.stringlist.exceptions.ItemNotExistException;
import com.example.stringlist.impl.StringListImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class StringListImplRemoveTest {

    private StringList out;

    @BeforeEach
    void setUp() {
        out = new StringListImpl();

        out.add("1");
        out.add("2");
        out.add("3");
    }

    @Test // remove(index)
    public void shouldReturnRemovedItem() {
        String actual = "2";
        String expected = out.remove(1);
        assertEquals(expected, actual);
    }

    @Test // remove(index) when index is bad
    public void shouldThrowIndexIsNotValidExceptionWhenCallRemoveWithBadIndex() {
        assertThrows(IndexIsNotValidException.class,
                () -> out.remove(4));
    }

    @Test // remove(item)
    public void shouldReturnRemovedItemWhenCalled() {
        String actual = "2";
        String expected = out.remove("2");
        assertEquals(expected, actual);
    }

    @Test // remove(item)
    public void shouldThrowItemNotExistException() {
        assertThrows(ItemNotExistException.class,
                () -> out.remove("10"));
    }
}
