package com.gmail.shared.dao;

import java.util.List;

public interface Dao<E> {
    List<E> getList();
    E get(int id);
    E update(E e);
    boolean add(E e);
    E remove(int id);
    void clear();
}
