package com.eurobaluchi.music.rest.controller;

import com.eurobaluchi.music.rest.exception.InvalidDataException;
import com.eurobaluchi.music.rest.service.BaseServiceApi;

import org.springframework.beans.factory.annotation.Autowired;
import org.modelmapper.ModelMapper;
import java.util.List;

public abstract class BaseController<T, D, N, S extends BaseServiceApi<T, N>> {
    private S service;

    @Autowired
    private ModelMapper modelMapper;

    public BaseController(S service) {
        this.service = service;
    }

    public S getService() {
        return service;
    }

    public ModelMapper getModelMapper() {
        return modelMapper;
    }

    public void setModelMapper(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    public List<T> list() {
        return getService().getAll();
    }

    public T show(N id) {
        return getService().getById(id);
    }

    public void delete(N id) {
        getService().removeById(id);
    }

    public T create(D dto, Class<T> entityType) {
        T entity = getModelMapper().map(dto, entityType);
        return getService().create(entity);
    }

    public T update(D dto, N id) {
        T dbEntity = getService().getById(id);
        getModelMapper().map(dto, dbEntity);
        return getService().update(dbEntity, id);
    }
    //    T patch(Map<String, Object> attributes, N id);
    public void validateIds(N id1, N id2, String str) {
        if (id1 != id2) {
            throw new InvalidDataException(str + " -> " + id1 + " should be the same as " + id2);
        }
    }
}
