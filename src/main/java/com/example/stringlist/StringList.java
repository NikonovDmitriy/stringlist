package com.example.stringlist;

public interface StringList {

    String add(String item);

    String add(int index, String item);

    String set(int index, String item);

    String remove(int index);

    String remove(String item);

    boolean contains(String item);

    int indexOf(String item);

    int lastIndexOf(String item);

    String get(int index);

    boolean equals(StringList otherList);

    String[] toArray();

    int size();

    boolean isEmpty();

    void clear();
}
