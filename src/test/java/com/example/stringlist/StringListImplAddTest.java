package com.example.stringlist;

import com.example.stringlist.exceptions.IndexIsNotValidException;
import com.example.stringlist.exceptions.ItemIsNullException;
import com.example.stringlist.impl.StringListImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class StringListImplAddTest {

    private StringList defaultEmptyList;
    private StringList defaultListWithThreeItems;
    private StringList fullListWithThreeItems;

    @BeforeEach
    void setUp() {
        defaultEmptyList = new StringListImpl();
        defaultListWithThreeItems = new StringListImpl();
        fullListWithThreeItems = new StringListImpl(3);

        defaultListWithThreeItems.add("1");
        defaultListWithThreeItems.add("2");
        defaultListWithThreeItems.add("3");

        fullListWithThreeItems.add("1");
        fullListWithThreeItems.add("2");
        fullListWithThreeItems.add("3");
    }

    @Test // add(item)
    public void shouldReturnAddedItem() {
        String actual = "actual";
        String expected =  defaultEmptyList.add(actual);
        assertEquals(expected, actual);
    }

    @Test // add(item) when count of items more when initialArraySize
    public void shouldReturnAddedItemWhenExpendArray() {
        String actual = "actual";
        String expected = fullListWithThreeItems.add(actual);
        assertEquals(expected, actual);
    }

    @Test // add(item) when item is null
    public void shouldThrowItemIsNullException() {
        assertThrows(ItemIsNullException.class,
                () -> defaultEmptyList.add(null));
    }

    @Test // add(index, item)
    public void shouldReturnAddedByIndexItem() {
        String actual = "actual";
        String expected = defaultListWithThreeItems.add(1, actual);
        assertEquals(expected, actual);
    }

    @Test // add(index, item) when index is bad
    public void shouldThrowIndexIsNotValidException() {
        assertThrows(IndexIsNotValidException.class,
                () -> defaultListWithThreeItems.add(-1, "example"));
        assertThrows(IndexIsNotValidException.class,
                () -> defaultListWithThreeItems.add(4, "example"));
    }

    @Test // add(index, item) when index > size of array
    public void shouldReturnAddedItemWhenIndexMoreWhenSizeOfArray() {
        String actual = "actual";
        String expected = fullListWithThreeItems.add(3, actual);
        assertEquals(expected, actual);
    }

    @Test // add(index, item) when item = null
    public void shouldThrowItemIsNullExceptionWhenTryToAddNullByIndex() {
        assertThrows(ItemIsNullException.class,
                () -> defaultListWithThreeItems.add(1, null));
    }

}
