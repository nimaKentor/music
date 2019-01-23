package com.eurobaluchi.music.rest.service;

import java.util.List;

public interface BaseServiceApi<T, N> {

    List<T> getAll();
    T getById(N id);
    T create(T entity);
    void removeById(N id);
    T update(T entity, N id);
}
